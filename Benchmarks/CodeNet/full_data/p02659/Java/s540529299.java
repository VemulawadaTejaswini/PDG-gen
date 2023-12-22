import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        double B = scanner.nextDouble();
        double Sum = A*B;
        
        System.out.println((long)Math.floor(Sum));
    }
}
