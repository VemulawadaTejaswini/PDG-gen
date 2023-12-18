import java.util.Scanner;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    private static long GCD(long a, long b) { return b==0 ? a : GCD(b, a%b); }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        System.out.println(((N*(long)2)/GCD(N,(long)2)));
    }
}
