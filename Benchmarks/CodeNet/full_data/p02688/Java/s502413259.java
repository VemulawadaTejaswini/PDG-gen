import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int k = sc.nextInt();   
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }   

        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            int[] A = new int[d];
            for (int j = 0; j < d; j++) {
                A[j] = sc.nextInt();
                A[j]--;
                a[A[j]]++;
            }

        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) cnt++;
        }
        System.out.println(cnt);   
    }
}