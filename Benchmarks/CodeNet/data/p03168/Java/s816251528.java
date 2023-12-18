
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
public class Main{
    static int n;
    static double[] p;
    static boolean v[][];
    static double dp[][];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = new double[n];
        v = new boolean[n+1][n+1];
        dp = new double[n+1][n+1];
        for(int i=0;i<n;i++)
        {
            p[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i=0;i<Math.ceil((double)n/2.0);i++)
        {
            sum += s(n-i,i);
        }
        System.out.println(sum);
    }
    public static double s(int i,int j)
    {
        if(i==0 && j==1)
            return 1-p[i+j-1];
        if(i==1 && j==0)
            return p[i+j-1];
        if(i==0 && j==0)
            return 0;
        if(i<0 || j<0)
            return 0;
        if(v[i][j])
            return dp[i][j];
        v[i][j] = true;
        return dp[i][j] = p[i+j-1]*s(i-1,j) + (1-p[i+j-1])*(s(i,j-1)); 
    }
}
