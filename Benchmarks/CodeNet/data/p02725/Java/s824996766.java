import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int b = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                b += Math.abs(a[j] - a[i]);
            }
            if(b < min){
                min = b;
                b = 0;
            }
        }
        if(a[n - 2] + Math.abs(k - a[n - 1]) < min){
            min = a[n - 2] + Math.abs(k - a[n - 1]);
        }
        System.out.println(min);
    }
}