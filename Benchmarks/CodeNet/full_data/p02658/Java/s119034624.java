import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = sc.nextLong();

        for (int i = 1; i < n; i++)  ans *= sc.nextLong();

        System.out.println((ans > (long) Math.pow(10, 18) || ans < 0) ? -1 : ans);
    }
}