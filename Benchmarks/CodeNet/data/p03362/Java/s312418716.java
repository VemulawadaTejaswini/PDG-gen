import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean primes[] = new boolean [55560];
        for (int n = 2; n < primes.length; n++) {
            if (primes[n]) continue;
            for (int m = 2 * n; m < primes.length; m += n) {
                primes[m] = true;
            }
        }

        int count = 1;
        System.out.print("2 ");
        for (int i = 7; i <= 55560; i+=5) {
            if (count == 5) {
                break;
            }
            if (!primes[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();


    }
}