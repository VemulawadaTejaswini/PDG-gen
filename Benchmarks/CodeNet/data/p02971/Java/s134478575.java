import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ARRAY = new int[N];

        for (int i=0; i<N; i++) {
            ARRAY[i] = scanner.nextInt();
        }

        int[] MAX_ARRAY = new int[N];
        for (int i=0; i<N; i++) {
            int max = 1;
            for (int k=0; k<N; k++) {
                if (k == i) continue;
                if (ARRAY[k] > max) {
                    max = ARRAY[k];
                    MAX_ARRAY[i] = max;
                }
            }
        }
        for (int i=0; i<N; i++) {
            System.out.println(MAX_ARRAY[i]);
        }
    }
}