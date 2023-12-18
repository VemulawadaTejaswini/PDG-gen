import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        if ((n-1) % (k-1) == 0) {
            ans = (n-1) / (k-1);
        } else {
            ans = (n-1) / (k-1) + 1;
        }

        System.out.println(ans);
    }
}
