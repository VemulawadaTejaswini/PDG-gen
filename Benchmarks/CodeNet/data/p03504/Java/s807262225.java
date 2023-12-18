import java.util.*;
 
public class Main{
public static Scanner sc = new Scanner (System.in);
public static int N = sc.nextInt(), C = sc.nextInt();
public static int[] s = new int[200002],t = new int[200002],c = new int[20002];
public static int[] sm = new int[200002], tt = new int[200002];
     public static void main(String []args){
        for(int i=0;i<N;i++){
            s[i]=sc.nextInt();
            t[i]=sc.nextInt();
            c[i]=sc.nextInt();//input
        }
        for(int i=1;i<=C;i++){
            for(int j=0;j<200002;j++)tt[j]=0;
            for(int j=0;j<N;j++)if(c[j]==i){
                tt[s[j]*2-1]++;
                tt[s[j]*2]--;
            }
            for(int j=1;j<200002;j++)tt[j] += tt[j-1];
            for(int j=0;j<200002;j++)if(tt[j]>0)sm[j]++;
        }
        int mx=0;
        for(int j=0;j<20002;j++)if(mx<sm[j])mx=sm[j];
        System.out.println(mx+1);
        
       
        
        
     }
}