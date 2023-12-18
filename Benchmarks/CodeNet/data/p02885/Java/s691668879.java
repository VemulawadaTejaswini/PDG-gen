import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int len = 0;
        if (A > (B * 2)) {
            len = A - (B * 2);
        }
        System.out.println(len);
    }
}
