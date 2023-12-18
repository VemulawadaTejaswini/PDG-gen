import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        long[] arr = new long[100001];
        
        for(int i = 0; i < n; i++){
            arr[scan.nextInt()] += scan.nextInt();
        }
        
        long sum = 0;
        
        for(int i = 1; i < 100001; i++){
            sum += arr[i];
            if(sum >= k){
                System.out.println(i);
                break;
            }
        }

    }
}
