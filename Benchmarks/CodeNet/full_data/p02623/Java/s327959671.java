
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        long cul1 = 0;
        long cul2 = 0;
        for(int i=0; i<n+1; i++){
            if(i==0){
                a[i] = 0;
            }else{
                a[i] = sc.nextInt();
                cul1 = cul1 + a[i];
                a[i] = cul1;          
            }
//            System.out.println(a[i]);
        }
        for(int i=0; i<m+1; i++){
            if(i==0){
                b[i] = 0;
            }else{
                b[i] = sc.nextInt();
                cul2 = cul2 + b[i];
                b[i] = cul2;          
            }
//            System.out.println(b[i]);
        }
        long max = 0;
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                long ans = a[i] + b[j];
                long pri = i + j;
                if(ans <= k){
                    max = Math.max(pri, max);
                }else{
                    break;
                }
            }
            if(a[i]>k){
                break;
            }
        }  
        System.out.println(max);
    }
}

