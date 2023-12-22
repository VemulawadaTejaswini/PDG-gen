import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            if(n==0) break;
            
            int sum = 0;
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = Integer.parseInt(sc.next());
                sum += data[i];
            }
            double mean = (double)sum / n;
            
            double vars=0.0;
            for(int i=0; i<n; i++){
                vars += Math.pow((data[i] - mean),2.0);
            }
            double std = Math.sqrt(vars / n);
            System.out.println(std);
        }
    }
}

