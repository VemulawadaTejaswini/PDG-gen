
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] toi = new char[h][w];

        Set<Integer> rmGyoSet = new HashSet<>();
        for (int i = 0; i< h; i++) {
            char[] gyo = sc.next().toCharArray();
            int gyocount = 0;
            for (int k = 0; k < w; k++) {
                toi[i][k] = gyo[k];
                if (gyo[k] == '.') {
                    gyocount++;
                }
            }
            if (gyocount == gyo.length) {
                rmGyoSet.add(i);
            }
        }

        Set<Integer> rmRetuSet = new HashSet<>();
        for (int i = 0; i< w; i++) {
            int count = 0;
            for (int k = 0; k < h; k++) {
                if (toi[k][i] == '.') {
                    count++;
                }
            }
            if (count == toi.length) {
                rmRetuSet.add(i);
            }
        }

        char[][] ans = new char[h-rmGyoSet.size()][w-rmRetuSet.size()];
        int gIndex = -1;
        for (int i = 0; i< h-rmGyoSet.size(); i++) {
            gIndex++;
            if (toi.length == gIndex) {
                break;
            }
            if (rmGyoSet.contains(gIndex)) {
                i--;
                continue;
            }
            int rIndex = -1;
            for (int k = 0; k < w-rmRetuSet.size(); k++) {
                rIndex++;
                if (toi[gIndex].length == rIndex) {
                    break;
                }
                if (rmRetuSet.contains(rIndex)) {
                    k--;
                    continue;
                }

//                ans[i][k] = toi[gIndex][rIndex];
                out.print(toi[gIndex][rIndex]);
            }
            out.println();
        }

        out.flush();
    }

    //    public static void calcD(Map<Integer, Integer> dic, int index, )

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
}