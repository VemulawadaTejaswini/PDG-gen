import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+2];
        p[0] =0;
        p[1] =0;
        for(int j =2; j< n+2;j++){
            p[j] = sc.nextInt();
        }
        for(int k =0;k < n +2; k++) {
            System.out.println(p[k]);
        }
        long ans = 0;
        for(int i =1; i< n+1;i++){
            if(abs(p[i+2] - p[i+1]) +abs(p[i+1] -p[i])> abs(p[i+2] - p[i+1])){
                ans +=abs(p[n-i+2] - p[n-i+1]);
                i++;
            }else{
                ans +=abs(p[i+2] - p[i+1]);
            }
                System.out.println(ans);
        }
        System.out.println(ans);

        }
    }