import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int m = 0;
        int a = 0;
        int r = 0; 
        int c = 0;
        int h = 0;
        int[] D = new int[5];
        int[] x = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2};
        int[] y = {1, 1, 1, 2, 2, 3, 2, 2, 3, 3};
        int[] z = {2, 3, 4, 3, 4, 4, 3, 4, 4, 4};

        for(int i=0; i<N; i++){
            String s = sc.next();
            if(s.charAt(0)=='M') m++;
            if(s.charAt(0)=='A') a++;
            if(s.charAt(0)=='R') r++;
            if(s.charAt(0)=='C') c++;
            if(s.charAt(0)=='H') h++;
        }
        D[0] = m;
        D[1] = a;
        D[2] = r;
        D[3] = c;
        D[4] = h;

        long ans = 0L;
        for(int i=0; i<10; i++){
            ans += D[x[i]] * D[y[i]] * D[z[i]];
        }
        System.out.println(ans);
    }
}