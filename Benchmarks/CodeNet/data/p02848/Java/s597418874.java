import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)+N <= 90) {
                ans += Character.toString(S.charAt(i) + N);
            }else
                ans += Character.toString(S.charAt(i) - (26-N));
        }
        System.out.println(ans);
    }

}
