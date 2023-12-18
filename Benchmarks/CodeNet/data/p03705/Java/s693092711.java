import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans;
        if (A > B) {
            ans = 0;

        } else if (N == 1) {
            ans = (A == B)? 1 : 0;

        } else {
            ans = (B - A) * (N - 2) + 1;
        }

        System.out.println(ans);
    }
}