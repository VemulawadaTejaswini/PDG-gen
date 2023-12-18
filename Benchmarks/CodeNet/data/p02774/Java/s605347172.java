import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.*;
import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    long f(long[] a,long[] b,long zero,long m) {
        //a_i*a_j<=mとなるものの数を数える。
        long ret=0;
        int t=a.length-1;
        for(int i=0;i<a.length;++i) {
            while(t>=0&&a[i]*a[t]>m)--t;
            ret+=Math.max(0, t-i);
        }
        t=0;
        for(int i=b.length-1;i>=0;--i) {
            while(t<b.length&&b[i]*b[t]>m)++t;
            ret+=Math.max(0, i-t);
        }
        t=0;
        for(int i=0;i<a.length;++i) {
            while(t<b.length&&a[i]*b[t]<=m)++t;
            ret+=Math.max(0, t);
        }
        if(m>=0)ret+=zero*(a.length+b.length)+zero*(zero-1)/2;
        return ret;
    }

    void run() {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long K=sc.nextLong();
        long[] A=new long[N];
        int plus=0,negative=0;
        for(int i=0;i<N;++i) {
            A[i]=sc.nextLong();
            if(A[i]>0)++plus;
            else if(A[i]<0)++negative;
        }
        Arrays.sort(A);
        long[] a=new long[plus];
        long[] b=new long[negative];
        long zero=N-plus-negative;
        int p=0,q=0;
        for(int i=0;i<A.length;++i) {
            if(A[i]>0)a[p++]=A[i];
            else if(A[i]<0)b[q++]=A[i];
        }
        long ok=(long)1e18+1;
        long ng=-(long)1e18-1;
        while(ok-ng>1) {
            long middle=(ok+ng)/2;
            if(f(a,b,zero,middle)>=K) {
                ok=middle;
            }else {
                ng=middle;
            }
        }
        System.out.println(ok);
    }

    static void tr(Object... objects) {
        System.out.println(Arrays.deepToString(objects));
    }

}

