import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] p = new int[N + 1];

        for(int i=1; i<=N; i++){
            p[i] = sc.nextInt();
        }

        int ans = 0;
        int x = 0;
        if(p[1]==1){
            ans += 1;
            x += 1;
        }
        for(int i=2; i<N; i++){
            if(p[i]==i){
                ans += 1;
                x += 1;
                if(p[i-1]==i-1 && x==2){
                    ans -= 1;
                    x = 0;
                }
            }
            else{
                x = 0;
            }
        }
        if(p[N]==N){
            ans += 1;
            x += 1;
            if(x==2){
                ans -= 1;
            }
        }
        System.out.println(ans);
    }
}