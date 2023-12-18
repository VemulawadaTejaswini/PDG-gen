import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] values = new int[N];
        int[] costs = new int[N];

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            costs[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (values[i] > costs[i]) {
                result += (values[i] - costs[i]);
            }
        }

        System.out.println(result);
    }
}
