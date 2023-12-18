import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n < k) {
            System.out.println(n);
        } else if(k == 1) {
            System.out.println(0);
        } else {
            System.out.println(n / k);
        }
    }
}