import java.io.*;
import java.util.*;

public class Main {

    static class Coord {
        long x;
        long y;

        public Coord(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coord coord = (Coord) o;
            return x == coord.x &&
                    y == coord.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) throws Exception {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = scan.nextInt();
        long[][] coords = new long[n][2];
        HashSet<Coord> coordMap = new HashSet<>();
        for (int i = 0; i < n; i++) {
            coords[i][1] = scan.nextInt();
            coords[i][0] = scan.nextInt();
            coordMap.add(new Coord(coords[i][1], coords[i][0]));
        }
        HashMap<Coord, Set<Coord>> grads = new HashMap<>();
        Coord maxGrad = null;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long deltaX = coords[i][1] - coords[j][1];
                long deltaY = coords[i][0] - coords[j][0];
                Coord coo = new Coord(deltaX, deltaY);
                Set<Coord> sets = grads.getOrDefault(coo, new HashSet<>());
                sets.add(new Coord(coords[j][1], coords[j][0]));
                grads.put(coo, sets);
                if (maxCount < grads.get(coo).size()) {
                    maxCount = grads.get(coo).size();
                    maxGrad = coo;
                }
            }
        }
        if (maxGrad == null) {
            out.println(coordMap.size());
        } else {
            for (int i = 0; i < n; i++) {
                long currX = coords[i][1];
                long currY = coords[i][0];
                if (!coordMap.contains(new Coord(currX, currY))) continue;
                Coord next = new Coord(currX + maxGrad.x, currY + maxGrad.y);
                while (coordMap.contains(next)) {
                    coordMap.remove(next);
                    next = new Coord(next.x + maxGrad.x, next.y + maxGrad.y);
                }
            }
            out.println(coordMap.size());
        }

        out.close();
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------

}