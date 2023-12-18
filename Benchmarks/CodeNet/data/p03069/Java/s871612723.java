import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int toBlack = 0;
        int toWhite = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '.') {
                toBlack++;
            }
            if (S.charAt(N-1-i) == '#') {
                toWhite++;
            }
        }

        System.out.println(Math.min(toBlack, toWhite));
    }
}
