import java.io.*;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int n=sc.nextInt();
        long k=sc.nextLong();
        int a[]=new int[n+1];
        int b=1;
        //System.out.println(n+" "+k);
        for(int i=1;i<=n;i++)
            a[i]=sc.nextInt();
        //System.out.println(k);
        if(k<=200000){
            while(k-->0){
                b=a[b];
            }
        }else{
            boolean m[]=new boolean[n+1];
            m[1]=true;
            int c=1;
            c=a[c];
            int count=0;
            //System.out.println("a");
            while (true){
                if(m[a[c]]) {
                    c=a[c];
                    break;
                }
                count++;
                c=a[c];
                m[c]=true;
            }
            //System.out.println(c+" "+count);
            b=1;
            while(true){
                b=a[b];
                k--;
                //System.out.println(b);
                if(b==c)
                    break;
            }
            k=k%count;
            while(k-->0){
                b=a[b];
            }
            //System.out.println(count);
        }
        System.out.print(b);
    }
}
