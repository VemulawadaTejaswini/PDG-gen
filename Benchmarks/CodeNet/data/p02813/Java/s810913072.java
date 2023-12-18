import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
    public static void main(String[] args)
    {
        new Main().run();
    }
    
    void run(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] P=new int[N];
        int[] Q=new int[N];
        int n1=0,n2=0;
        for(int i=0;i<N;++i)P[i]=sc.nextInt();
        for(int i=0;i<N;++i)Q[i]=sc.nextInt();
        for(int i=0;i<N;++i)n1=n1*10+P[i];
        for(int i=0;i<N;++i)n2=n2*10+Q[i];
        int ans=0;
        if(n1>n2){
            n1^=n2;
            n2^=n1;
            n1^=n2;
        }
        while(true){
            if(n1==n2)break;
            ++n1;
            while(!ok(n1,N))++n1;
            ++ans;
        }
        System.out.println(ans);
    }
    
    boolean ok(int v,int n){
        boolean[] f=new boolean[10];
        while(v>0){
            if(f[v%10])return false;
            f[v%10]=true;
            v/=10;
        }
        boolean ret=true;
        for(int i=1;i<=n;++i)ret&=f[i];
        return ret;
    }
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
