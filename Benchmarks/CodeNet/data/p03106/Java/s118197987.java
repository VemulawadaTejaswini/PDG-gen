import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long k = sc.nextLong();
        int count = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
            if (count >= k) {
                System.out.println(i);
                return;
            }
        }
    }

}
