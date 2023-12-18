import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        if (N == 1) {
            System.out.println(0);
            return;
        }

        boolean foundBlack = false;;
        int toBlack = 0;
        for (int i = 0; i < N; i++) {
            if (foundBlack && S.charAt(i) == '.') {
                toBlack++;
            }
            if (S.charAt(i) == '#') {
                foundBlack = true;;
            }
        }

        boolean foundWhite = false;;
        int toWhite = 0;
        for (int i = N-1; i >= 0; i--) {
            if (foundWhite && S.charAt(i) == '#') {
                toWhite++;
            }
            if (S.charAt(i) == '.') {
                foundWhite = true;
            }
        }

        System.out.println(Math.min(toBlack, toWhite));
    }
}
