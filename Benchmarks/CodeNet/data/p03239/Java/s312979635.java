import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            if (sc.nextInt() <= t && c < min) {
                min = c;
            }
        }
        if (min > t) {
            System.out.println("TLE");
        } else {
            System.out.println(min);
        }
    }
}
