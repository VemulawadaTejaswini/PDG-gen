import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        // ArrayDeque<Integer> z = new ArrayDeque<Integer>();
        // z.add(2);

        int[] z = new int[100100100];
        z[0] = 1;
        int count = 0;

        while (N != 1) {
            int tmpZ = z[count] + 1;
            for (int i = tmpZ; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                    z[count] = 1;
                    N /= i;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
