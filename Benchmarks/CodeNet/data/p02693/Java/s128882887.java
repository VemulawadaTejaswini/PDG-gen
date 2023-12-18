import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < 1000; i += k) {
            if (a <= i && i <= b) {
                System.out.println("OK");
            return;
            }
        }
        System.out.println("NG");
    }
}
