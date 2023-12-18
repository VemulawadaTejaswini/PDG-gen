import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        
        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}