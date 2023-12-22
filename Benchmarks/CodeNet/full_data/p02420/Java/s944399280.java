import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true) {
            String s = sc.next();
            if (s.equals("-")) break;
            solve(s, sc.nextInt());
        }
    }
    
    private static void solve(String s, int m) {
        int c = 0;
        int l = s.length();
        for (int i = 0;i < m;i++) c += sc.nextInt();
        c %= l;
        if (c == 0) {
            System.out.println(s);
        } else {
            System.out.print(s.substring(c, l));
            System.out.print(s.substring(0, c));
            System.out.println("");
        }
    }
}

