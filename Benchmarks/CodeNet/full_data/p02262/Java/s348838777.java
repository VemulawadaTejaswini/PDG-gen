import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt(r);
        int[] A = new int[n];
        for (int i = 0;i < n;i++) {
            A[i] = readInt(r);
        }

        shellSort(A, n);
        System.out.println(cnt);
        for (int i = 0;i < n;i++) {
            System.out.println(A[i]);
        }
    }

    public static void insertionSort(int[] A, int n, int g) {
        for (int i = g;i < n;i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j + g] = v;
        }
    }

    public static void shellSort(int[] A, int n) {
        cnt = 0;
        int[] tmpG = new int[100];
        int m = 0;
        for (int x = 1;;) {
            if (x > n) break;
            tmpG[m++] = x;
            x = 3 * x + 1;
        }
        
        int[] G = new int[m];
        for (int i = 0;i < m;i++) {
            G[i] = tmpG[m - i - 1];
        }
        
        System.out.println(m);
        System.out.println(dump(G, m));

        for (int i = 0;i < m;i++) {
            insertionSort(A, n, G[i]);
        }
    }

    // Stable: true
    // Unstable: false
    public static void swapInt(int[] A, int j, int k) {
        int v = A[j];
        A[j] = A[k];
        A[k] = v;
    }
    
    public static String dump(int[] A, int N) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < N;i++) {
            if (i != 0) {
                builder.append(" ");
            }
            builder.append(A[i]);
        }
        return builder.toString();
    }
    
    public static int readInt(BufferedReader r) throws Exception {
        return Integer.parseInt(r.readLine());
    }
}