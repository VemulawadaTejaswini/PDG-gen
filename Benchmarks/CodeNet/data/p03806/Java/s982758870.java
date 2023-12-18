import java.util.*;

import jdk.nashorn.internal.runtime.arrays.IntOrLongElements;

public class Main{
    static int[] a;
    static int[] b;
    static int[] c;
    static int n, ma, mb;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.next());
        ma=Integer.parseInt(sc.next());
        mb=Integer.parseInt(sc.next());
        a=new int[n];
        b=new int[n];
        c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(sc.next());
            b[i]=Integer.parseInt(sc.next());
            c[i]=Integer.parseInt(sc.next());
        }
        sc.close();
        int ans=search(0, 0, 0, 0);
        if(ans==Integer.MAX_VALUE) ans=-1;
        System.out.println(ans);

    }

    public static int search(int sumA, int sumB, int sumC, int st){
        if(st==n-1){
            if(sumA*mb==sumB*ma && sumA!=0) return sumC;
            else if((sumA+a[n-1])*mb==(sumB+b[n-1]*ma)) return sumC+c[n-1];
            else return Integer.MAX_VALUE;
        }
        return Math.min(search(sumA+a[st], sumB+b[st], sumC+c[st], st+1), search(sumA, sumB, sumC, st+1));
    }
}