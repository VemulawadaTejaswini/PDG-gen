import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        Utility.FastReader fr = new Utility.FastReader();
        Solver solver = new Solver(fr);
        int t = 1;
        while (t-- > 0) {
            solver.solve();
        }
        long timeEnd = System.nanoTime();
//        System.out.println("Completed in :" + ((double) (timeEnd - timeStart) / 1000000) + " miliseconds");
    }

    static class Solver {
        Utility.FastReader fr;

        public Solver(Utility.FastReader fr) {
            this.fr = fr;
        }

        void solve() {
            int n=fr.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; ++i) arr[i]=fr.nextInt();
            int count=0;
            for(int i=1; i<n; ++i){
                if(arr[i] < arr[i-1]){
                    int diff=(arr[i-1] - arr[i]);
                    count+=diff;
                    arr[i] += diff;
                }
            }
            System.out.println(count);
        }
    }

    static class Utility {
        static void sort(int[] a) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : a) list.add(i);
            Collections.sort(list);
            for (int i = 0; i < a.length; i++) a[i] = list.get(i);
        }

        static void shuffleArray(long[] arr) {
            int n = arr.length;
            Random rnd = new Random();
            for (int i = 0; i < n; ++i) {
                long tmp = arr[i];
                int randomPos = i + rnd.nextInt(n - i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }
        }

        static void shuffleArray(int[] arr) {
            int n = arr.length;
            Random rnd = new Random();
            for (int i = 0; i < n; ++i) {
                int tmp = arr[i];
                int randomPos = i + rnd.nextInt(n - i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }
        }

        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        static long gcd(long a, long b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                br = new BufferedReader(new
                        InputStreamReader(System.in));
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
}

