import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        char[] ch = sc.next().toCharArray();
        int x = 0;
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            x = (ch[i] == 'I') ? ++x : --x;
            max = Math.max(x, max);
        }
        
        out.println(max);
        
        out.flush();
    }
}