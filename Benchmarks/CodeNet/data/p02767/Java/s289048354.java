import java.math.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int ans = 1001001001;
        for(int i = 0 ; i<x.length;i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i<=100 ;i++){
            int tmp = 0;
            for(int j = 0;j<n;j++){
                tmp += (x[j]-i)*(x[j]-i);
            }
            ans = Math.min(tmp,ans);
        }
        System.out.println(ans);
    }
}
