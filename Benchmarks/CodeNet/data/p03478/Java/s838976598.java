import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = findSumOfDigits(i);
            if (a <= sumOfDigits && sumOfDigits <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int findSumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}