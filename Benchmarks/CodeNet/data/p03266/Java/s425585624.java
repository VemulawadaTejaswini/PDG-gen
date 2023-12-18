import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = 0;
        int numB = 0;
        int numA = 0;
        if (k % 2 == 1) {
            num = n / k;
            System.out.println((int) Math.pow(num, 3));
        } else {
            numA = n / k;
            numB = numA + 1;
            System.out.println((int) Math.pow(numA, 3) + (int) Math.pow(numB, 3));
        }
    }
}
