import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] b = nints(N);
        for (int i = 0; i < N; i++) {
            if (b[i] > i+1) {
                so.println("-1");
                return;
            }
        }
        int[] ans = new int[N];
        
        for (int i = 0; i < N; i++) {
            ans = insert(ans, b[i]-1, b[i]);
        }
        for (int a: ans) {
            so.println(a);
        }
    }
    
    static int[] insert(int[] a, int index, int toInsert) {
        int[] newA = a.clone();
        int len = newA.length;
        for (int i = len-1; i >= index; i--) {
            newA[i] = (i == index) ? toInsert : newA[i-1];
        }
        return newA;
    }
    
    static int  nint()   { return sc.nextInt(); }
    static long nlong()  { return sc.nextLong(); }
    static String next() { return sc.next(); }
    static int[] nints(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nint();
        return a;
    }
}
