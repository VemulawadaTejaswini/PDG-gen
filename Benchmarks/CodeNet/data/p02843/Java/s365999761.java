import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        for (int i = 0; i < X; i++) {
            int low = 100 * i, high = 105 * i;
            if (low <= X && X <= high) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
}
}