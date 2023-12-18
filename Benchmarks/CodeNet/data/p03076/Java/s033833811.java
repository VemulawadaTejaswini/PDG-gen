import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int a[] = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 3928237;
        for(int i = 0; i < 5; i++) {
            int sum = 0;
            for(int j = 0; j < 5; j++) {
                if(i != j) {
                    sum += a[j];
                    if(a[j] % 10 != 0) {
                        sum += 10 - a[j] % 10;
                    }
                } else {
                    sum += a[j];
                }
            }
            ans = Math.min(ans,sum);
        }
        System.out.println(ans);
    }
}