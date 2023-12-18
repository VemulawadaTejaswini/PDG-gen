import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        long[] A = new long[N];
        long ans = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(A[i]<=200000){
                int a = (int)A[i];
                for(int j=i+a+1; j<N; j++){
                    if(Math.abs(j-i)==A[j]+A[i]){
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}