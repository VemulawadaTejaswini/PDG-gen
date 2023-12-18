import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean bool = a % 2 == 0
                || b % 2 == 0;
        System.out.println(bool ? "No" : "Yes");
    }
}
