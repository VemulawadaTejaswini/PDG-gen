import java.util.*;
public class Main {

    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        String S = sc.next();

        //logic
        if (N % 2 == 1) {
            System.out.println("No");
        } else {
            String T = S.substring(0, N/2);
            if (T.contains(S.substring(N/2, S.length()))) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}