import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by paz on 17-3-12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long[] list = new long[N];
        for(int i =0; i < N; i++) {
            list[i] = sc.nextLong();
        }
        Arrays.sort(list);
        long sum = 0;
        long tmp = 0;
        for(int i = 0, j = 0; i < N; i++) {
            if(j == 0) {
                j++;
                sum++;
                tmp = list[i];
            } else {
                if(tmp + K >= list[i]) {
                    tmp = list[i];
                    j++;
                } else {
                    j = 1;
                    sum++;
                    tmp = list[i];
                }
            }
            if(j == C) {
                j = 0;
            }
        }
        System.out.println(sum);
    }
}