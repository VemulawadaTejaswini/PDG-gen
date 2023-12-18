import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N+1];
        A[0]=0;
        for(int i=1;i<N+1;i++){
            A[i]=sc.nextInt();
        }
        int[]B=new int[N+2];
        B[0]=A[0];
        B[N+1]=0-A[N];
        for(int i=1;i<N+1;i++){
            B[i]=A[i]-A[i-1];
        }
        for(int i=2;i<N+2;i++){
            int a=B[i]+B[i-1];
            int b=B[i];
            int c=B[i-1];
            B[i]=0;
            B[i-1]=0;
            int sum=0;
            for(int j=0;j<N+2;j++){
                sum+=Math.abs(B[j]);
            }
            sum+=Math.abs(a);
            B[i]=b;
            B[i-1]=c;
            System.out.println(sum);
        }
       

       
        
    }}