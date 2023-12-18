import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        int[] n = new int[N];
        int min = 2147483647;
        for(int k = -N/2; k < N/2; k++){
            int sum = 0;
            for(int i = 0; i < N; i++){
                n[i] = a[i]-k-i;
                if (n[i] < 0) {
                    n[i] = -n[i];
                }else{}
                sum += n[i];
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}