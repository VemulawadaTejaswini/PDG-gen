import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sub = b - a;
        int length = 0;
        for (int i = sub; i > 0; i--) {
            length += i;
        }

        System.out.println(length - b);
    }
}