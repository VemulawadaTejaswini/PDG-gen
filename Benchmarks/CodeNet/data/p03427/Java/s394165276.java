import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long n = N;
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n = n /10;
        }
        int k = 0;
        long a = 0;
        while (N  > 0) {
            a = N;
            N = N /10;
            k++;
        }
        System.out.println(Math.max((a-1 + 9*(k - 1)), total));
    }

}
