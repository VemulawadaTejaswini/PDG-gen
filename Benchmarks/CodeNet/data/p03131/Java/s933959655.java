import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();

        long num = 1;

        if (a+2 > b) {
            num += k;
        } else {
            if (k >= a+1) {
                long turn = a+2;
                num = b;
                while (turn <= k) {
                    if (turn+2 <= k) {
                        num +=(b-a);
                        turn += 2;
                    } else {
                        num++;
                        turn++;
                    }
                }
            } else {
                num += k;
            }
        }
        
        System.out.println(num);
    }
}
