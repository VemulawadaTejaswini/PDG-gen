import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[] sum = new int[110000];
        sum[0] = 100000;
        for (int i = 1; i < N; ++i) {
            StringBuilder a = new StringBuilder(Integer.toString(i));
            StringBuilder b = new StringBuilder(Integer.toString(N - i));
            for (int j = 0; j < a.length(); j++) {
                sum[i] += Integer.parseInt(a.substring(j, j + 1));
            }
            for (int j = 0; j < b.length(); j++) {
                sum[i] += Integer.parseInt(b.substring(j, j + 1));
            }
        }

        Arrays.sort(sum);
        for (int i = 0; i < 110000; i++) {
            if (sum[i] != 0) {
                System.out.println(sum[i]);
                break;
            }
        }
    }
}