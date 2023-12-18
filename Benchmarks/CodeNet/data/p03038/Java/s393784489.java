import java.io.*;
import java.util.*;

public class ABC127d{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=Integer.parseInt(scan.next());
        int m=Integer.parseInt(scan.next());

        ArrayList<Integer> A=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            A.add(Integer.parseInt(scan.next()));
        }



        for(int i=0;i<m;i++){
            int b=Integer.parseInt(scan.next());
            int c=Integer.parseInt(scan.next());

            for(int j=0;j<b;j++){
                int minAind=A.indexOf(Collections.min(A));
                if(A.get(minAind) <= c){
                    A.set(minAind,c);
                }
                else break;
            }

        }

        long sum = 0;
        for(int d : A){
        sum += d;
        }

        System.out.print(sum);
        
        
     
    }
}