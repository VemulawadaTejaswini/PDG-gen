import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = input.nextInt();
        for (int i = 1; i < n; ++i) {
            System.out.print(a[0]);
            for (int k = 1; k < n; ++k) System.out.print(" " + a[k]);
            System.out.println("");
            int key = a[i];
            int k = i - 1;
            while (k >= 0 && a[k] > key) {
                a[k + 1] = a[k];
                --k;
            }
            a[k + 1] = key;
        }        
        System.out.print(a[0]);
        for (int i = 1; i < n; ++i) System.out.print(" " + a[i]);
        System.out.println("");
    }   
}