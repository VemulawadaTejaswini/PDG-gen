import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int[] start = new int[M];
        int[] end = new int[M];
        for (int i = 0; i < M; i++) {
            start[i] = Integer.parseInt(sc.next());
            end[i] = Integer.parseInt(sc.next());
        }
        int card = 0;
        
        for (int i = 1; i <= N; i++) {
            int pass = 0;
            for (int j = 0; j < M; j++) {
                if (start[j] <= i && i <= end[j]) {
                    pass++;
                } else {
                    break;
                }
            }
            if (pass == M)  card++;
        }
        
        out.println(card);
        
        out.flush();
    }
}