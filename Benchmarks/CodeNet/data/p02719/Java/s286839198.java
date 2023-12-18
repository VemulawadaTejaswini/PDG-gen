import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n < k) {
            long min = Math.min(n, k - n);
            System.out.println(min);
        } else if(k == 1) {
            System.out.println(0);
        } else if(n % k == 0){
            System.out.println(0);
        } else {
            long tmp = n % k;
            long min = Math.min(tmp, Math.abs(tmp - k));
            System.out.println(min);
        }
    }
}