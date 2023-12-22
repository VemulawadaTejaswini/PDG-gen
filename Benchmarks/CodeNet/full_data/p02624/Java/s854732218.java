

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long[] arr = new long[10010000];
        long j = 0;
        for(int l = 1; l <= n; l++) {
            int count = 0;
            for(int i = 1; i <= l; i++) {
                if(n%i==0) count++;
            }
            arr[(int)j] = count*l;
            j++;
        }
        long res = 0;
        for(int i = 0; i < n; i++) {
            res += arr[i];
        }
        System.out.println(res);
    }
}
