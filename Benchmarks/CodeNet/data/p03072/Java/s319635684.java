import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int f = 0;
        int[] h = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            boolean look = true;
            for (int j = 0; j < i; j++) {
                if (h[j] > h[i]) {
                    look = false;
                    break;
                }
            }
            if (look == true) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        
    }
}
