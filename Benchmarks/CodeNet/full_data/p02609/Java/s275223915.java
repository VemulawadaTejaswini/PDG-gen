import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int count(int a){
        int m=0;
        while(a!=0){
            a=a&a-1;
            m++;
        }
        return m;
    }
    public static int fastpow(int a,int n,int modn){
        if(n==0)return 1;
        if(n==1) return a%modn;
        int temp=fastpow(a,n/2,modn);
        if(n%2==1)
            return temp%modn*temp%modn*a%modn;
        else return temp%modn*temp%modn;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        String n=sc.next();
        boolean b[]=new boolean[200050];
        int g[]=new int[200050];
        int k=0;
        char z[]=n.toCharArray();
        int count=0;
        int p=0;//+
        int q=0;//-
        for(int i=0;i<n.length();i++){
            if(z[i]=='1')
                count++;
        }
        //System.out.println(count);
        for(int i=0;i<n.length();i++){
            if(z[i]=='1') {
                p += Main.fastpow(2, m-1-i, count + 1);
                p%= (count + 1);
                if(count!=1) {
                    q += Main.fastpow(2, m-1-i, count - 1);
                    q %= (count - 1);
                }
            }
        }
        if(count==1)
            q=0;
        //System.out.println(p+"   "+q);
        for(int i=n.length()-1;i>=0;i--) {
            int pp;
            if(z[i]=='0')
                pp=(p+Main.fastpow(2,m-1-i,count+1))%(count+1);
            else {
                if(count==1) {
                    pp = 0;
                    b[m-1-i]=true;
                }
                else pp = (q - Main.fastpow(2, m - 1 - i, count - 1)+count-1) % (count - 1);
            }
            //System.out.println("pp="+pp);
            int ans = 0;
            while (pp!= 0) {
                pp %=Main.count(pp);
                ans++;
            }
            //System.out.println(ans);
            g[k++]=ans;
        }
        for(int i=k-1;i>=0;i--) {
            if(b[i]) System.out.println("0");
            else System.out.println(g[i]+1 );
        }
    }

}
