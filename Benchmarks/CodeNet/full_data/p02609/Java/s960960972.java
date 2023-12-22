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
    public static BigInteger fasePow(int a,int n){
        if(n==1) return BigInteger.valueOf(a);
        BigInteger temp=fasePow(a,n/2);
        if(n%2==1)
            return temp.multiply(temp).multiply(BigInteger.valueOf(a));
        else return temp.multiply(temp);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        String n=sc.next();
        BigInteger two=new BigInteger("2");
        BigInteger q = new BigInteger(n, 2);
        int g[]=new int[200050];
        int k=0;
        char z[]=n.toCharArray();
        BigInteger v=BigInteger.ONE;
        int count=0;
        for(int i=0;i<n.length();i++){
            if(z[i]=='1')
                count++;
        }
        int count1;
        for(int i=n.length()-1;i>=0;i--) {
            BigInteger p;
            int pp;
            if(z[i]=='0') {
                count1=count+1;
                if(i!=n.length()-1)
                    v=v.multiply(two);
                p = q.add(v);
                p=p.mod(BigInteger.valueOf(count1));
                pp=p.intValue();
            }
            else {
                count1=count-1;
                if(i!=n.length()-1)
                    v=v.multiply(two);
                p=q.subtract(v);
                p=p.mod(BigInteger.valueOf(count1));
                pp=p.intValue();
            }
            //System.out.println(pp);
            int ans = 0;
            while (pp!= 0) {
                pp %=Main.count(pp);
                ans++;
            }
            g[k++]=ans;
        }
        for(int i=k-1;i>=0;i--)
            System.out.println(g[i]+1);
    }

}
