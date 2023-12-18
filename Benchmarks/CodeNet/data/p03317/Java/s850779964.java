import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n == k) {
            System.out.println(1);
        } else {
            int ans = (int) Math.ceil(n / (k - 1));
            System.out.println(ans);
        }
    }
}