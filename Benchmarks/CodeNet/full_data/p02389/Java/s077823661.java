import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int area = a * b;
        int around = 2 * (a + b);
        System.out.println(String.format("%1$s %2$s", area, around));
    }
}
