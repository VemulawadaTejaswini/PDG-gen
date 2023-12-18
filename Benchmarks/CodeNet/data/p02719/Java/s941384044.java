import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long remainder = n % k;
        long smallest = remainder;
        while (Math.abs(k - remainder) < smallest) {
        	smallest = Math.abs(k - remainder);
        }
        System.out.println(smallest);
        sc.close();
    }
}