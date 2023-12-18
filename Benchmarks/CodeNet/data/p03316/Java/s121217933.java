import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digitSum = digitSum(n);
        boolean res = (n % digitSum == 0);

        System.out.println(res ? "Yes" : "No");
    }

    private static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
