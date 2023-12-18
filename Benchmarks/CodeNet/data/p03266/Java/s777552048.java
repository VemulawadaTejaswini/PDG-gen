import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k % 2 == 0) {
            long b = 0;
            long c = 0;
            for (int i = 1; i <= n ; i++) {
                if (i % k == k/2) {
                    b++;
                } else if (i%k == 0) {
                    c++;
                }
            }
            long ans = b* b * b + c * c * c;
            System.out.println(ans);
        } else {
            long c = 0;
            for (int i = 1; i <= n ; i++) {
                if (i%k == 0) {
                    c++;
                }
            }
            long ans =  c * c * c;
            System.out.println(ans);
        }
    }

}