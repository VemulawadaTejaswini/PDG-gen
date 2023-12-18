
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakas
 */
public class Main {
    static int n;
    static int n1=0;
    static int n2=0;
    static int n3=0;
    static boolean[][][] v;
    static double[][][] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        v = new boolean[n+1][n+1][n+1];
        dp = new double[n+1][n+1][n+1];
        for(int i=0;i<n;i++)
        {
            int temp = sc.nextInt();
            if(temp==1)
                n1++;
            else if(temp==2)
                n2++;
            else if(temp==3)
                n3++;
        }
        System.out.println(s(n1,n2,n3));
    }
    public static double s(int i,int j,int k)
    {
        int l = n - (i+j+k);
        if(i==0&&j==0&&k==0)
            return 0;
        if(i<0 || j<0 || k<0)
            return 0;
        if(v[i][j][k])
            return dp[i][j][k];
        v[i][j][k] = true;
        return dp[i][j][k] = (n/(double)(n-l))*(1 + (i/(double)n)*s(i-1,j,k) + (j/(double)n)*s(i+1,j-1,k) + (k/(double)n)*s(i,j+1,k-1));
    }
}
