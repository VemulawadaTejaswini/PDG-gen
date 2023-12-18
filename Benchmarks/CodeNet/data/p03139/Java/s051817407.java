import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int min = Math.abs(a - b);
        int max = Math.abs(a + b);
        
        if(max > n) {
            max = n;
        }
        
        System.out.println(String.format("%d %d", a, b));
    }
}