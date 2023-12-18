

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[N+1];
        for(int i = 0; i < N; i++) {
            if(i+1 < N && str.charAt(i) == 'A' && str.charAt(i+1) == 'C') {
                arr[i+1] = arr[i] + 1;
            } else {
                arr[i+1] = arr[i];
            }
        }
        for(int q = 0; q < Q; q++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            --l;
            --r;
            System.out.println(arr[r] - arr[l]);
        }

    }
}
