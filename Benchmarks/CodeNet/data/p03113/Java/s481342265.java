import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean fa = false;
        int[] a = new int[n];
        int ebishu = 10000;
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
            if(k > a[i]){
                fa = true;
            }
            ebishu = Math.min(ebishu , a[i]);
        }
        sc.close();
        if(fa){
            System.out.println(-1);
        }else{
            for(int i = 0 ; i < ebishu * n; i++){
                System.out.print(i % n + 1);
                if(i != ebishu * n - 1){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }
            }
        }
    }
}