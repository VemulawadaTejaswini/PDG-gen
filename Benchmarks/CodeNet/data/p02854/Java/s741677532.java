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
        int subsum = 0;
        int minsum = sum;
        for(int i = 0; i < n; i++){
            subsum = subsum + a[i];
            if(minsum > Math.abs((sum-subsum)-subsum)){
                minsum = Math.abs((sum-subsum)-subsum);
            }
        }
        System.out.print(minsum);
    }
}