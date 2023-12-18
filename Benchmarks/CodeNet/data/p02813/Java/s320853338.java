import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        int[] C = new int[N];
        String p = "";
        String q = "";
        int a = 0;
        int b = 0;
        int lap = 0;
        for (int i = 0; i < N; i++) {
            C[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            p += sc.next();
        }
        for (int i = 0; i < N; i++) {
            q += sc.next();
        }
        sc.close();
        
        do {
            lap++;
            String s = "";
            for (int i = 0; i < N; i++) {
                s += C[i];
            }
            if (s.equals(p)) a = lap;
            if (s.equals(q)) b = lap;
        } while (nextPermutation(C));
        
        out.println(Math.abs(a - b));
        
        out.flush();
    }
    
    public static boolean nextPermutation(int[] a) {
        for (int i = a.length - 1; 0 < i; i--) {
            if (a[i - 1] < a[i]) {
                int index = find(a[i - 1], a, i, a.length - 1);
                int temp = a[index];
                a[index] = a[i - 1];
                a[i - 1] = temp;
                Arrays.sort(a, i, a.length);
                return true;
            }
        }
        return false;
    }

    // destより大きい要素の中で最小のもののインデックスを二分探索で探す
    private static int find(int dest, int[] a, int s, int e) {
        if (s == e) {
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
    }

}