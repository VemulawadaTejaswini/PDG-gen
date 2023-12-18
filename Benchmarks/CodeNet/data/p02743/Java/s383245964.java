import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (c <= 4) {
            System.out.println("No");
        } else {
            System.out.println((4*a*b) < ((c-a-b)*(c-a-b)) ? "Yes" : "No");
        }
    }
}
