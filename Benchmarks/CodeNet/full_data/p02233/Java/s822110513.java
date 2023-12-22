
import java.util.Scanner;

public class Main {

    private static final int MAX_N = 44;
    private static int[] d = new int[MAX_N+1];

    private static int n;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        System.out.println(fibonacchi(n));
    }

    private static int fibonacchi(int n) {

        if (n <= 1)
            return 1;

        if (d[n] > 0)
            return d[n];

        d[n] = fibonacchi(n-1) + fibonacchi(n-2);

        return d[n];
    }
}