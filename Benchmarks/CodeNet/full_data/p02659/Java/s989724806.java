import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        String result = String.valueOf(Math.floor(a * b));
        System.out.println(result.replace(".0",""));
    }
}
