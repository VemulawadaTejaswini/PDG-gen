import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (n % 111 == 0) {
                System.out.println(n);
                return;
            } else {
                n = i;
            }
        }
    }
}