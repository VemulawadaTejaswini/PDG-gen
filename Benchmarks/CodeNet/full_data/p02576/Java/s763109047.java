
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int X = sc.nextInt();
        final int T = sc.nextInt();
        
        System.out.println((N + X - 1) / X * T);
    }
}
