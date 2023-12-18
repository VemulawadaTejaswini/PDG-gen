package atCoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by paz on 17-3-12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n[] = new int[N];
        for(int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        int s = 0;
        long sum = 0;
        for(int i = 0; i < N - 1; i++) {
            sum += n[i];
            if(sum * 2 < n[i+1]) {
                s = i + 1;
            }
        }
        System.out.println(N - s);
    }
}
