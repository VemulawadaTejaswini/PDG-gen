

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] arr = new long[5];
        long mi = 1L << 60;
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            mi = Math.min(mi, arr[i]);
        }
        System.out.println((N+mi-1)/mi + 4);
    }
}
