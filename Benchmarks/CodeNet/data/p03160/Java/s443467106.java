import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(h[0]-h[1]);
        for(int i=2;i<n;i++){
            dp[i]=Integer.min(dp[i-2]+Math.abs(h[i]-h[i-2]),dp[i-1]+Math.abs(h[i]-h[i-1]));
        }
        System.out.println(dp[n-1]);
    }
    public static int setBit(long n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int sum=0,x=0,y=0;
        for(int i=n-1;i>0;i--){

            if(i-2>=0){
                x=Math.abs(h[i]-h[i-1]);
                y=Math.abs(h[i]-h[i-2]);
                if(x<y)sum+=x;
                else{
                    sum+=y;
                    i--;
                }
            }
            else{
                x=Math.abs(h[i]-h[i-1]);
                sum=sum+x;
            }
        }
        System.out.println(sum);
    }
    public static int setBit(long n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}