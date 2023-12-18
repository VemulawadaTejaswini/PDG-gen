import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % sum(n) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int sum(int n) {
        int total = 0;
        while (n != 0) {
            total += n % 10;
            n = n / 10;
        }
        return total;
    }
}
