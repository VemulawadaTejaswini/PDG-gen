import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int k = sc.nextInt();   
        int d;
        int A;
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = 0;
        }
        for (int i = 0; i < k; i++) {
            d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                A = sc.nextInt();
                A--;
                people[A]++;
            }
        }
        
        int res = 0;
        for (int i = 0; i < n;i++) {
            if (people[i] == 0) res++;
        }
        System.out.println(res);   
    }
}