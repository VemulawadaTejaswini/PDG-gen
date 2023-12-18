import java.util.*;
import java.text.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a > 0 && b > 0) {
            System.out.println("Positive");
        } else if (a < 0 && b < 0) {
            if ((b-a)%2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } else {
            System.out.println("Zero");
        }
    }
}