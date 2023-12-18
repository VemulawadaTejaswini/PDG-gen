import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
 
      int result = n / (a + b) * a;
        int rem = n % (a + b);
        result += Math.min(rem, a);
        System.out.println(result);
    }
}