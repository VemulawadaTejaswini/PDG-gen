import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int asum = 0;
        int bsum = 0;
        for(int i = 0; i < n; i++){
            asum = asum + a[i];
        }
        for(int i = 0; i < n; i++){
            bsum = bsum + b[i];
        }
        int change = 0;
        for(int i = 0; i < n; i++){
            if(a[i] < b[i]){
                change++;
            }
        }
        if(asum < bsum){
            System.out.print(-1);
        } else if(change == 0){
            System.out.print(0);
        } else {
            System.out.print(change+1);
        }
    }
}