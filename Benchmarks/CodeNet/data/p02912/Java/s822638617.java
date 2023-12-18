import java.util.Scanner;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] tickets = new int[N];
        int[] results = new int[N];
        int[] tmpResults = new int[N];
        for (int i=0; i<N; i++) {
            results[i] = scanner.nextInt();
        }

        for (int i=0; i<M; i++) {
            maxIndex(results, tickets);
        }

        long sum=0;
        for (int i=0; i<N; i++) {
            sum += results[i];
        }
        System.out.println(sum);
    }

    private static void maxIndex(int[] array, int[] tickets) {
        count++;
        int maxIndex = 0;
        int max = array[maxIndex];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
        }
        if (array[maxIndex] > 0) {
            array[maxIndex] = max>>1;
        }
    }
}