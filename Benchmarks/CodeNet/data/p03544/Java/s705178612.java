import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long memo[]=new long[n+1];
        System.out.println(cal(n,memo));

    }
    public static long cal(int n,long[]memo){
        if(n==1) return 1;
        if(n==0) return 2;
        if(memo[n]!=0) return memo[n];
        memo[n]=cal(n-1,memo)+cal(n-2,memo);
        return memo[n];
    }
}