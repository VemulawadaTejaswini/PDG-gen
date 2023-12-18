import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int min = 2019;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r + 1; j++) {
                if (i * j % 2019 < min) {
                    min = i * j % 2019;
                }
                if (min == 0)
                    break;
            }
            if (min == 0)
                break;
        }
        System.out.println(min);
    }
}
