import java.util.*;
import java.io.*;

public class Main{
    public static int gojo(int a,int b){
        if(a%b==0)return b;
        return gojo(b,a%b);
    }
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        for(int i=0;i<n;i++)ary[i]=sc.nextInt();
        sc.close();
        int maxnum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int gt=gojo(Math.max(ary[i],ary[j]),Math.min(ary[i],ary[j]));
                if(maxnum<gt){
                    maxnum=gt;
                }
            }
        }
        System.out.println(maxnum+"\n");
    }
}