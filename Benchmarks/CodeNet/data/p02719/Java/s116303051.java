

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n <= k) {
            System.out.println(n);
            return;
        }
        long val = n%k;
        if(val == 0) {
            System.out.println(val);
            return;
        }
        System.out.println(Math.abs(val-k));
    }
}
