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

        int b,c,i,j;

        for(i=0;i<m;i++){

            b=Integer.parseInt(scan.next());
            c=Integer.parseInt(scan.next());
            
            shuffleArray(A);
            Arrays.sort(A);
            j=0;

            while(A[j]<c && j<b){

                 A[j] = c;
                 j = j+1;
            }
        }

        long sum = 0;
        for(long d : A){
        sum += d;
        }
        System.out.print(sum);
        
        
     
    }

    static void shuffleArray(long[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            long tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }   
}

}

