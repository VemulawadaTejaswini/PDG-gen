import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }        
        int ans = 10000000;
        int sumr = 0;
        int suml = 0;
        
        for(int i=0; i<n; i++){ 
            if(i+k-1<n){
                sumr = Math.abs(x[i])+Math.abs(x[i+k-1]-x[i]);
                suml = Math.abs(x[i+k-1])+Math.abs(x[i+k-1]-x[i]);
                if(sumr<ans){
                    ans = sumr;
                }
                if(suml<ans){
                    ans = suml;
                }
            }
        }
        System.out.println(ans);
    }
}