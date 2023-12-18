import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long ans = 0;
        if (n > 1 && m > 1) {
            ans = (n-2) * (m-2);
        } else {
            ans = Math.max(n-2, 1) * Math.max(m-2, 1);;
        }

        System.out.println(ans);
    }
}
