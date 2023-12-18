import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            b[i] = a[i];
        }
        
        Arrays.sort(b);
        
        for (int i = 0; i < n; i++) {
            if (a[i] != b[n-1]) {
                System.out.println(b[n-1]);
            }
            else {
                System.out.println(b[n-2]);
            }
        }
        
    }

    
}



