import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long num = 0;
        long numB = 0;
        long numA = 0;
        if (k % 2 == 1) {
            num = n / k;
            System.out.println((long) Math.pow(num, 3));
        } else {
            numA = n / k;
            numB = numA + 1;
            System.out.println((long) Math.pow(numA, 3) + (long) Math.pow(numB, 3));
        }
    }
}
