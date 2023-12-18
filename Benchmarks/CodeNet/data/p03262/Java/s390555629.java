import java.util.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] d = new int[N];

        for(int i=0; i<N; i++){
            d[i] = Math.abs(sc.nextInt() - X);
        }

        int k = d[0];

        for(int i=1; i<N; i++){
            for(int j=0; j<1000000; j++){
                if(d[i]>=k){
                    int a = d[i];
                    int b = k;
                    if(a % b==0){
                        break;
                    }
                    k = a % b;
                    d[i] = b;
                }
                else{
                    int a = k;
                    int b = d[i];
                    if(a % b==0){
                        k = b;
                        break;
                    }
                    d[i] = a % b;
                    k = b;
                }
            }
        }
        System.out.println(k);
    }
}