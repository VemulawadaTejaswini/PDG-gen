
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] L = new int[N];
        for (int i=0; i < N; i++) {
            L[i] = scanner.nextInt();
        }

        long count = 1;
        long index = 0;
        for (int i=0; i< N; i++) {
            index += L[i];
            if (index > X) {
                break;
            }

            count++;
        }

        System.out.println(count);
    }
}