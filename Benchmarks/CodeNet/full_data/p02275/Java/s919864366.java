import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{


    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();


        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[10001];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            C[A[i]]++;
        }

        for (int i = 1; i < C.length; i++)
            C[i] += C[i-1];


        for (int i = A.length-1; i >= 0; i--){
            B[C[A[i]]-1] = A[i];
            C[A[i]]--;
        }

        StringBuilder s = new StringBuilder().append(B[0]);
        for (int i = 1; i < n; i++)
            s.append(" ").append(B[i]);

        System.out.println(s);


    }

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

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine(){
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

