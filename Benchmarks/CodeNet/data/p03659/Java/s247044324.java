import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        int snuke = a[0];
        int minsub = sum;
        for(int i = 1; i < n-1; i++){
            snuke = snuke + a[i];
            if(Math.abs(sum - snuke*2) < minsub){
                minsub = Math.abs(sum - snuke * 2);
            }
        }
        if(n == 2){
            System.out.print(Math.abs(a[0]-a[1]));
        } else {
        System.out.print(minsub);
        }
    }
}