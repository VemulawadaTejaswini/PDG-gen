import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);

        int sheets = 0;
        for (int i = 0; i < N; i++) {
            if (i==0 || d[N-1-i]<d[N-i]) {
                sheets++;
            }
        }

        System.out.printf("%d\n", sheets);
        sc.close();
    }
}