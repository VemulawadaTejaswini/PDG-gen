import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        
        for(int i = 1; i < n+1; i++){
            left[i] = a[i-1]+left[i-1];
        }
        
        for(int i = n-1; i >= 0; i--){
            right[i] = a[i] + right[i+1];
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i < n; i++){
            min = Math.min(min, Math.abs(left[i] - right[i]));
        }
        
        System.out.println(min);
    }
}
 

