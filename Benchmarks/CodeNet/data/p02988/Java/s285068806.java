import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int n = sc.nextInt();
       int[] p = new int[n];
       for (int i = 0; i < n; i++) {
           p[i] = sc.nextInt();
       }
       int ans = 0;
       for (int i = 0; i < n; i++) {
           if (i < n-2) {
               if ((p[i] < p[i+1] && p[i+1] < p[i+2]) || (p[i] > p[i+1] && p[i+1] > p[i+2])) {
                   ans++;
               }
           }
       }
       System.out.println(ans);
    }

}
