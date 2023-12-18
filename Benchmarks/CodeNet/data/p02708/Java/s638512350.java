import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] numbers = new int[N+1];
        for (int i=0; i<=N; i++) {
            numbers[i] = i;
        }

        long sum = 0;

        long min = sum(numbers, K);
        long max = sumReverse(numbers, K);
        sum += max - min + 1;

        for (int i=K; i<=N; i++) {
            min = min + i;
            max = max + N - i;
            sum += max - min + 1;
        }
        System.out.println(sum % 1000000007);
    }
    static long sum(int[] array, int length) {
        long sum = 0;
        for (int i=0; i<length; i++) {
            sum += array[i];
        }
        return sum;
    }
    static long sumReverse(int[] array, int length) {
        long sum = 0;
        for (int i=array.length-1; i > array.length - 1 - length; i--) {
            sum += array[i];
        }
        return sum;
    }
}
