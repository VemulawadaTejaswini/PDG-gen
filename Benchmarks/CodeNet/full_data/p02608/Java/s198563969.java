import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = func(i);
            System.out.println(count);
        }
    }

    private static int func(int n) {
        int count = 0;
        for (int x = 1; x * x < n; x++) {
            for (int y = 1; y * y < n; y++) {
                for (int z = 1; z * z < n; z++) {
                    if (calc(x,y,z) == n) count++;
                }
            }
        }
        return count;
    }

    private static int calc(int x, int y, int z) {
        return x * x + y * y + z * z + x *y + x* z + y*z;
    }
}