import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        System.out.println(4*a*b < (c-a-b)*(c-a-b) ? "Yes" : "No");
    }
}
