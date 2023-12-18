import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;
    private List<Integer> T;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = scanner.nextInt();
            int C = scanner.nextInt();
            int K = scanner.nextInt();
            T = new ArrayList<Integer>();
            for (int i = 0; i < N; i++) {
                T.add(scanner.nextInt());
            }
            Collections.sort(T);
            int count = 0;
            while (T.size() > 0) {
                int max = T.get(0) + K;
                int index = 0;
                while (index < T.size() && T.get(index) <= max) {
                    index++;
                }
                //System.out.println(index + " " + T.size());
                if (index < C) {
                    for (int i = 0; i < index; i++) {
                        T.remove(0);
                    }
                } else {
                    for (int i = 0; i < C; i++) {
                        T.remove(0);
                    }
                }
                count++;
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}