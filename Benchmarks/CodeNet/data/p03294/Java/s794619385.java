import java.util.*;
import java.io.*;

public class C103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 2; i <= 3000; i++) {
            sum = 0;
            for(int j = 0; j < n; j++){
                sum += i % a[j];
                // System.out.println(sum);
            }
            // System.out.println(max);
            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);
        
        sc.close();
    }
}