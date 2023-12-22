import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int MAX_A = 10000 + 10;
    static int n;

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());

        int[] A = new int[n + 10];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        int[] B = new int[n + 10];
        CountingSort(A, B);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(i == 0 ? "" : " ");
            sb.append(B[i]);
        }
        System.out.println(sb.toString());
    }

    static void CountingSort(int[] A, int[] B) {
        int[] C = new int[MAX_A];

        for (int i = 0; i < n; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i < MAX_A; i++) {
            C[i] += C[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            C[A[i]]--;
            B[C[A[i]]] = A[i];
        }
    }

    public static class Scanner {
        private BufferedReader br;
        private StringTokenizer tok;

        public Scanner(InputStream is) throws IOException {
            br = new BufferedReader(new InputStreamReader(is));
        }

        private void getLine() throws IOException {
            while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
        }

        private boolean hasNext() {
            return tok != null && tok.hasMoreTokens();
        }

        public String next() throws IOException {
            getLine(); return tok.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public void close() throws IOException {
            br.close();
        }
    }
}