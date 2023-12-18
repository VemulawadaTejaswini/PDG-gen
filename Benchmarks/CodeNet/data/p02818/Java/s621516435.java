import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();
        long aConsumed = Math.min(a, k);
        long bConsumed = Math.min(b, k-aConsumed);
        System.out.print(a-aConsumed);
        System.out.print(' ');
        System.out.print(b-bConsumed);
        System.out.println();
    }
}
