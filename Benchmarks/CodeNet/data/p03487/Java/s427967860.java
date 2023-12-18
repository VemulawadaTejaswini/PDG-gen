import java.util.*;

public class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                        a[i] = sc.nextInt();
                }
                int all_counter = 0;
                int counter;
                Arrays.sort(a);
                for (int i = 1, j = 0; j != N - 1 && i <= 10; i++) {
                        counter = 0;
                        for (; a[j] == i; j++) {
                                counter++;
                                if (j == N - 1) break;
                        }
                        if (i < counter) all_counter += counter - i;
                        if (i > counter) all_counter += counter;
                }
                System.out.println(all_counter);
        }
}
