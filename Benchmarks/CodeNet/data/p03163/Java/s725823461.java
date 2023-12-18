///package Educ_DP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] l=s.nextLine().split(" ");
        int num=Integer.parseInt(l[0]);
        int w=Integer.parseInt(l[1]);
        long[][] dp=new long[num][w];
        long[][] list=new long[num][2];
        for (int i=0;i<num;i++){
            String[] x=s.nextLine().split(" ");
            long[] a=new long[2];
            for (int j=0;j<2;j++){
                a[j]=Long.parseLong(x[j]);
            }
            list[i]=a.clone();
        }
        for (int i=0;i<w;i++){
            if (list[0][0]>=i+1){
                dp[0][i]=list[0][1];
            }
        }
        for (int i=1;i<num;i++){
            for (int j=0;j<w;j++){
                dp[i][j]=dp[i-1][j];
                int left=(int)(j-list[i][0]);
                if (left>=0){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][left]+list[i][1]);
                }
            }
        }
        System.out.println(dp[num-1][w-1]);



    }
}
