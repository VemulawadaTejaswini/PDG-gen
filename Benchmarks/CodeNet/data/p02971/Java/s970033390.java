import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            int max = 0;
            for (int j=0; j<N; j++) {
                if (j != i && numbers[j] > max) {
                    max = numbers[j];
                }
            }
            System.out.println(max);
        }
    }
}