

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] h = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = scanner.nextInt();
        }
        for(int i = 1; i < n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i - 1; j > -1 && j >= i - k; j--){
                min = Math.min(min, c[j]+Math.abs(h[j]-h[i]));
            }
            c[i] = min;
        }
        System.out.println(c[n-1]);
    }
}
