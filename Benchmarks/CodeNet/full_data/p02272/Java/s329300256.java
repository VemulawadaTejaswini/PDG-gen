import java.io.*;
import java.util.*;

// MergeSort O(nlogn)
public class Main {

    private static final int MAX = 500000;
    private static final int SENTINEL = 2000000000; // 番兵
    private static int[] L = new int[MAX/2+2];
    private static int[] R = new int[MAX/2+2];
    private static int cnt = 0;


    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int[] A = new int[MAX];
        StringBuilder builder = new StringBuilder();
        cnt = 0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) A[i] = sc.nextInt();
        mergeSort(A, n ,0, n);
        for(int i=0; i<n; i++){
            if(i == 0) builder.append(A[i]);
            else builder.append(" ").append(A[i]);
        }
        System.out.println(builder.toString());
        System.out.println(cnt);

    }
    static void merge(int A[],int n, int left, int mid, int right){
        int n1 = mid - left;
        int n2 = right - mid;
        for (int i=0; i<n1; i++) L[i] = A[left + i];
        for(int i=0; i<n2; i++) R[i] = A[mid + i];
        L[n1] = R[n2] = SENTINEL;
        int i = 0;
        int j = 0;
        for(int k=left; k<right; k++){
            // 比較回数を計算
            cnt++;
            // 小さい方を元の配列に格納する
            if(L[i] <= R[j]){
                A[k] = L[i++];
            }else{
                A[k] = R[j++];
            }
        }
    }
    static void mergeSort(int A[], int n, int left, int right){
        // left と right の　差が 1 より上だったら
        if(left+1 < right){
            int mid = (left + right)/2;
            mergeSort(A, n, left ,mid);
            mergeSort(A, n, mid, right);
            merge(A, n, left, mid, right);
        }
    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
