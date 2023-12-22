import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        
        long year = 0;
        long result = 100;
        for (int i = 1; result < X; year++) {
            result *= 1.01;
        }
        System.out.println(year);
    }
}