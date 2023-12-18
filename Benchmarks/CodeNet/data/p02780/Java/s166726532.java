import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] ary=new int[n];
        int max=0,memo=0;
        for(int i=0;i<n;i++){
            ary[i]=sc.nextInt();
            if(i<k){
                max+=ary[i];
            }
        }
        int tmp=max;
        for(int i=0;i<n-k;i++){
            tmp=tmp-ary[i]+ary[i+k];
            if(max<tmp){
                max=tmp;
                memo=i+1;
            }
        }
        double ans=0;
        for(int i=0;i<k;i++){
            ans+=(((double)ary[memo+i]*(1+ary[memo+i])/2)/ary[memo+i]);
        }
        System.out.printf("%.12f\n",ans);
    }
}