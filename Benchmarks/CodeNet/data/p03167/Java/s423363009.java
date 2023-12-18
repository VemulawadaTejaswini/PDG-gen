import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=0,m=0;
        if(scan.hasNext())
            n=scan.nextInt();
        if(scan.hasNext())
            m=scan.nextInt();
        String s="";
        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                s=scan.next();
            arr[i]=s.toCharArray();
        }
        long[][] dp=new long[n][m];
        for(int i=0;i<n;i++){
            if(arr[i][0]=='#'){
                break;
            }
            dp[i][0]=1;
        }
        for(int j=0;j<m;j++){
            if(arr[0][j]=='#'){
                break;
            }
            dp[0][j]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]=='#'){
                    continue;
                }
                dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000009;
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
