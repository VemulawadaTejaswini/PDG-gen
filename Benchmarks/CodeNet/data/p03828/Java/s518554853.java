import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] divisorList = new int[N];
        int mod = (int) (Math.pow(10, 9) + 7);
        double result = 1;
        for (int i = N; i >= 2; i--) {
            calcNumOfDivisor(i, divisorList);
        }
        for (int i = 0; i < divisorList.length; i++) {
            result = result * (divisorList[i] + 1) % mod;
        }

        System.out.println((int)result);
    }
    public static void calcNumOfDivisor(int num, int[]divisorList) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                divisorList[i - 1]++;
                num /= i;
            }
        }
    }
}