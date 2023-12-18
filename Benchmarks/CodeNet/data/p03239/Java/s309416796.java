import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int c[] = new int[n];
        int t[] = new int[n];
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if (t[i] > T) {
                c[i] = 1001;
            }
        }
        int min = 1001;
        for(int i = 0; i < n; i++){
            min = Math.min(min, c[i]);
        }
        if (min == 1001) {
            System.out.println("TLE");
        }else{
            System.out.println(min);
        }
    }
}
