import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){a[i]=scan.nextLong();}

        int q=scan.nextInt();
        int ans=0;
        for(int i=0;i<q;i++){
            long t=scan.nextLong();
            if(check(a,t)){
                ans++;
            }
        }
        System.out.println(ans);
    }
    private static boolean check(long[]a,long t){
        int l=0,r=a.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]<t){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        if(a[r]==t)return true;
        else return false;
    }
}
