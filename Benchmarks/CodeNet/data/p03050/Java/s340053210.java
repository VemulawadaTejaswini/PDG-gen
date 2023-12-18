import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        
        int a = (int) Math.sqrt(n);
        long sum = 0;
        for (int i = 1; i <= a + 1; i++) {
            if (n % i == 0) {
                sum += ((long) n / i) - 1;
            }
        } 
        System.out.println(sum);
    }
}

