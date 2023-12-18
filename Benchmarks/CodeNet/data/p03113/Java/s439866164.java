import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean fa = false;
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
            if(k >= a[i]){
                fa = true;
            }
        }
        sc.close();
        if(fa){
            System.out.println(-1);
        }else{
            for(int i = 0 ; i <= k + n; i++){
                System.out.print(i % n + 1);
                if(i != k + n){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }
            }
        }
    }
}