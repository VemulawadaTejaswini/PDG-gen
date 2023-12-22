//package src.com.jetman.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;


    private void slove() {

        int n = sc.nextInt();

        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
        }

        long ans = Long.MIN_VALUE;
        for(int k=0;k<(1<<2);k++)
        {
            long mi=Long.MAX_VALUE;
            long ma=Long.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                long tmp=0;
                for(int j=0;j<2;j++)
                    if((k&(1<<j)) > 0) tmp+=a[i][j];
                    else tmp-=a[i][j];
                ma=Math.max(ma,tmp);
                mi=Math.min(mi,tmp);
            }
            ans=Math.max(ans,ma-mi);
        }

        System.out.println(ans);





    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
