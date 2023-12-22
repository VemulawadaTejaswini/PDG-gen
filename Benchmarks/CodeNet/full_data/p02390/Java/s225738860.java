import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int h = num / 3600;
        num %= 3600;
        
        int m = num / 60;
        num %= 60;
        
        int s = num;
        
        System.out.println(String.format("%1$s:%2$s:%3$s", h, m, s));
    }
}
