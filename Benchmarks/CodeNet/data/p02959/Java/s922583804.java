import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];

        for(int i = 0; i < n+1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            int min1 = Math.min(a[i], b[i]);
            b[i] -= min1;
            sum += min1;
            int min2 = Math.min(a[i+1], b[i]);
            sum += min2;
        }

        System.out.println(sum);


    }
}