import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[9];
        for(int i = 0; i < n; i++) {
            int temp = scan.nextInt()/400;
            if(temp < 8)
            arr[temp]++;
            else
            arr[8]++;
            
        }
        
        int min = 0;
        for(int i = 0; i < 8; i++) if(arr[i] > 0) min++;
        
        System.out.println(min + " " + (min + arr[8]));
    }
}

