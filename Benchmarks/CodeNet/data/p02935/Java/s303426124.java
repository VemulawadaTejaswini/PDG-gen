

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double res = 0;
        double tmp = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i = 1; i < N; i++) {
            if(i == 1) {
                tmp = (arr[i-1] + arr[i]) / 2;
            }
                res = (tmp + arr[i]) / 2;
        }
        System.out.println(res);
    }
}
