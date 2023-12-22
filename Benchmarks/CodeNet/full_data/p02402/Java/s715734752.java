import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
 import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Long> array = new ArrayList<Long>();
        
       
        for(int i=0;i<n;i++){
            array.add(toLong(scan.nextInt()));
        }
        
        long min=1000001;
        long max=-1000001;
        long sum = 0;
        
        for(long i : array){
            if(min > i) min = i;
            if(max < i) max = i;
            sum += i;
        }
        
        System.out.println(min + " " + max + " " + sum);
        scan.close();
    }
    
    public static long toLong(Number number){
        return number.longValue();
    }
}