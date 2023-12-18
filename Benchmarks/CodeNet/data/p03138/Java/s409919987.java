

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long sqrt = (long) Math.floor(Math.sqrt(k));
        long max = 1;
        for (int i = 0; i < sqrt; i++) {
            max *= 2;
        }
        if(sqrt==0){
            max = 0;
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            if (temp < max) {
                sum += temp + max;
            } else if (temp > max) {
                sum += temp - max;
            }
        }
        System.out.println(sum);
    }
}
