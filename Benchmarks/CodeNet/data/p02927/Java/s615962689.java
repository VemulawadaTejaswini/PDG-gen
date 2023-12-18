import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int m = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= d; j++) {
                int d_10 = j / 10;
                int d_1 = j % 10;
                if(d_1 > 1 && d_10 > 1 && d_10 * d_1 == i) ans++;
            }
        }

        System.out.println(ans);


    } 
}