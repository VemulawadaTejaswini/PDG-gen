import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a / b;
        int r = a % b;
        double f = (double)a / b;
        System.out.println(d + " " + r + " " + String.format("%.8f", f));
    }
}
