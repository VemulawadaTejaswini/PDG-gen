

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[N+M];
        for(int i = 0; i < (M+N); i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        int res = 0;
        long total = 0;
        for(int i = 0; i < (M+N); i++) {
            total += arr[i];
            if(total > k) break;
            res++;
        }
        System.out.println(res);
    }
}
