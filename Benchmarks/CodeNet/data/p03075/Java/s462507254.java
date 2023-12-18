import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] p = new int[5];
        
        for (int i = 0; i < 5; i++) {
            p[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        boolean ans = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (Math.abs(p[i] - p[j]) > k) {
                    ans = false;
                }
            }
        }
        
        System.out.println(ans?"Yay!":":(");

    }
}
