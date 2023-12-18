import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        char before = S.charAt(0);
        int minus = 0;
        for (int i=1;i<N;i++) {
            if (S.charAt(i)==before) {
                minus++;
            }
            before = S.charAt(i);
        }
        System.out.println(N-minus);
    }
}