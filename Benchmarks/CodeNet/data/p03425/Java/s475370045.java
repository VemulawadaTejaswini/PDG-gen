import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        long[] arr = new long[5];
        int n = scan.nextInt();
        
        for(int x = 0; x < n; x++){
            String temp = scan.next();
            switch(temp.charAt(0)){
                case 'M':
                    arr[0]++;
                    break;
                
                case 'A':
                    arr[1]++;
                    break;
                    
                case 'R':
                    arr[2]++;
                    break;
                    
                case 'C':
                    arr[3]++;
                    break;
                    
                case 'H':
                    arr[4]++;
                    break;
                    
                default:
                    break;
            }
        }
        
        long ans = 0;
        
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    ans += arr[i]*arr[j]*arr[k];
                }
            }
        }

        System.out.println(ans);
        
    }
}
