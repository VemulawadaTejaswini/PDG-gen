import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] data = new int[n];
        double sum = 0.0;
        int ave = 0;
        
        for(int i=0; i<n; i++){
            data[i] = sc.nextInt();
            sum += data[i];
        }
        
        ave = (int)(Math.round(sum/n));
        sum = 0;
        
        for(int i=0; i<n; i++){
            if(data[i]!=ave){
                sum += (data[i]-ave) * (data[i]-ave); 
            }
        }
        
        System.out.println((int)(sum));
        
    }
}
