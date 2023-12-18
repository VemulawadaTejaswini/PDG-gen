import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] luca = new long[n];
        luca[0] = 2;
        luca[1] = 1;
        for (int i = 2 ; i < n ; i++) {
            luca[i] = luca[i-1] + luca[i-2];
        }
        System.out.println(luca[n-1]);
    }
}