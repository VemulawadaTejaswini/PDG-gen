import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static int gcd(int a,int b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long sum=0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    int m=gcd(i,gcd(j,k));
                    sum+=m;
                }
            }
        }
        System.out.println(sum);
    }
}
