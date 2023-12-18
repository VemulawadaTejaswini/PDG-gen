import java.util.Scanner;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] tickets = new int[N];
        int[] array = new int[N];
        for (int i=0; i<N; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i=0; i<M; i++) {
            int maxIndex = maxIndex(array, tickets);
            if ((array[maxIndex] >> tickets[maxIndex]) > 0) {
                tickets[maxIndex]++;
            }
        }

        long sum=0;
        for (int i=0; i<N; i++) {
            sum += array[i] >> tickets[i];
        }
        System.out.println(sum);
    }

    private static int maxIndex(int[] array, int[] tickets) {
        count++;
        int maxIndex = 0;
        int max = array[maxIndex] >> tickets[maxIndex];
        for (int i = 1; i < array.length; i++) {
            int v = array[i] >> tickets[i];
            if (v > max) {
                maxIndex = i;
                max = v;
            }
        }
        return maxIndex;
    }
}