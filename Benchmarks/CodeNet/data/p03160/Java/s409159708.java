import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+2];
        long ans = 0;
        for(int i =0; i< n+1;i++){
            if(abs(p[n-i+2] - p[n-i+1]) +abs(p[n-i+1] -p[n-i])> abs(p[n-i+2] - p[n-i+1])){
                ans +=abs(p[n-i+2] - p[n-i+1]);
                i++;
            }else{
                ans +=abs(p[n-i+2] - p[n-i+1]);
            }
        }
        System.out.println(ans);
        
        }
    }