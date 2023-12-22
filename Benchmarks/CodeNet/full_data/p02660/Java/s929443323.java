import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        if(n == 1) {
            System.out.println(0);
            System.exit(0);
        }

        int cnt = 0;
        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                n /= i;
                cnt++;
            }
            if(n < i) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
