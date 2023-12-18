import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] X = new int[N];

        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i=1; i<N; i++){
            if((X[i]-X[i-1])*A<=B){
                ans += (X[i] - X[i - 1]) * A;
            }
            else{
                ans += B;
            }
        }
        System.out.println(ans);
    }
}