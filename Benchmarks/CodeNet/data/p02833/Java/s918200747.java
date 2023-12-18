import java.util.Scanner;

public class Main {
    public static long f(long n) {

        long count = 0;
        for (long i = 5; (n/i) > 0; i=i*5) {
            count = count + n/i/2;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(f(N));

    }
}
