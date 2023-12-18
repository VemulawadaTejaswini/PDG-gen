import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        long k=sc.nextLong();
        sc.close();
        if(k>=(1<<m)){
            System.out.println(-1);
            return;
        }
        StringBuilder sb=new StringBuilder();
        if(k==0){
            for(int i=0;i<(1<<m);i++){
                for(int j=0;j<2;j++) sb.append(i+" ");
            }
            System.out.println(sb);
            return;
        }
        if(m==1){
            System.out.println(-1);
            return;
        }
        long[] ans=new long[1<<(m+1)];
        int el=0;
        for(int i=0;i<(1<<m);i++){
            if(i==(1<<m)-1){
                ans[(1<<m)-1]=k;
                ans[(1<<(m+1))-1]=k;
            }
            else{
                ans[i]=el;
                ans[(1<<(m+1))-2-i]=el;
                el++;
                if(el==k) el++;
            }
        }
        for(long a:ans) sb.append(a+" ");
        System.out.println(sb);
    }
}