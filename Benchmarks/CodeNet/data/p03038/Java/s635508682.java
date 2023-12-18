import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=Integer.parseInt(scan.next());
        int m=Integer.parseInt(scan.next());

        long[] A=new long[n];

        for(int i=0;i<n;i++){
            A[i]=scan.nextLong();
        }


        for(int i=0;i<m;i++){
            int b=Integer.parseInt(scan.next());
            int c=Integer.parseInt(scan.next());
            
            Arrays.sort(A);

            for(int j=0;j<b;j++){
               while(A[j]<c){
                        A[j]=(long)c;
                }
            }
        }

        long sum = 0;
        for(long d : A){
        sum += d;
        System.out.print(d);
        }
        System.out.print(sum);
        
        
     
    }
}