import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int[] ar = new int[M];
        int[] br = new int[M];
        for (int i = 0; i < M; i++) {
            ar[i] = Integer.parseInt(sc.next());
            br[i] = Integer.parseInt(sc.next());
        }
        
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (ar[j] == i || br[j] == i) {
                    cnt++;
                }
            }
            out.println(cnt);
        }
        
        out.flush();
    }
}