import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        int N = c.length;

        boolean flag = true;
        for (int i=0;i<N/2;i++) {
            if (c[i]!=c[N-1-i]) flag = false;
        }

        for (int i=0;i<(N-1)/2/2;i++) {
            if (c[i]!=c[(N-1)/2-1-i]) flag = false;
        }
        for (int i=0;i<(N-3)/2/2;i++) {
            if (c[(N+3)/2-1+i]!=c[N-1-i]) flag = false;
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}