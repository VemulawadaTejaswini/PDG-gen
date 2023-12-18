import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] ary=new long[n];
        for(int i=0;i<n;i++){
            ary[i]=sc.nextLong();
        }
        int l=0,r=n-1;
        long total=0;
        while(l<r){
            long max=0;
            int mem=0;
            for(int i=l;i<r;i++){
                if(max<ary[i]){
                    mem=i;
                    max=ary[i];
                }
            }
            if(mem-l>=r-mem){
                total+=max*(mem-l);
                l++;
            }else{
                total+=max*(r-mem);
                r--;
            }
        }
        System.out.println(total+4);
    }
}