

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;
        while(true) {
            int max = 0;
            for(int i = 0; i < N; i++) {
                max = Math.max(max, arr[i]);
            }
            if(max == 0) break;

            int j = 0;
            while(j < N) {
                if(arr[j] == 0) j++;
                else {
                    res++;
                    while(j < N && arr[j] > 0) {
                        arr[j]--;
                        j++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
