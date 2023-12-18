import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                for (int k = 1; k <  N+1; k++) {
                        ans += gcd(gcd(i, j), k);
                }
            }
        }

        System.out.println(ans);
    }

    static int gcd (int num1, int num2) {
        if(num2  == 0) return num1;
        else return gcd(num2, num1%num2);
    }
}
