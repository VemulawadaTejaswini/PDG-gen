import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int v = c - a - b;
        System.out.println(v <= 0 || v * v <= 4 * a * b ? "No" : "Yes");
    }
}