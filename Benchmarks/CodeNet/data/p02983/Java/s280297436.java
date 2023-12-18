import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int result = 2018;
        loop: for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                result = Math.min(result, (i * j) % 2019);
                if ((i * j) % 2019 == 0) {
                    break loop;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}