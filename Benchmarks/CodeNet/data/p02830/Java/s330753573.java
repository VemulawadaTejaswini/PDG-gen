import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        char[] Sc = S.toCharArray();
        char[] Tc = T.toCharArray();

        String ans = "";
        for(int i=0; i<N; i++) {
            ans += Sc[i];
            ans += Tc[i];
        }

        System.out.println(ans);

    }
}