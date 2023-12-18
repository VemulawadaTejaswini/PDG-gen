import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();

        int count = 0;
        while (s > 5) {
            if (s >= 500) {
                s -= 500;
                count += 1000;
            } else if (s >= 5) {
                s -= 5;
                count += 5;
            }
        }
        System.out.println(count);
    }
}
