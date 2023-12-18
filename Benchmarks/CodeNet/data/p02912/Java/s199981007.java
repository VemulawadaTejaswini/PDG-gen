import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            Arrays.sort(a);
            a[n-1] = a[n-1]/2;
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        System.out.print(sum);
    }
}