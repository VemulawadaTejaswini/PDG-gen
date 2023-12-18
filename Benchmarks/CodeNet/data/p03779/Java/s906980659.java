import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            int max = i * (i+1) / 2;
            if (x <= max) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(1);
    }
}