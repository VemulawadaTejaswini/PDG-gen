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
        long tmp = n;
        for(int i=2; i<n; i++) {
            if(tmp % i == 0) {
                tmp /= i;
                cnt++;
            }
            if(tmp < i) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
