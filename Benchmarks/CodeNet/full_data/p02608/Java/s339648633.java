import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int m = 1; m <= n; m++) {
            int count = 0;
            for (int x = 1; x < n; x++) {
                for (int y = 1; y < n; y++) {
                    for (int z = 1; z < n; z++) {
                        if (CalculateRight(x, y, z) == CalculateLeft(x, y, z, m)) {
                            count = count + 1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static int CalculateRight(int x, int y, int z) {
        return (int) Math.pow((x + y + z), 2);
    }

    public static int CalculateLeft(int x, int y, int z, int m) {
        return m + x*y + y*z + z*x;
    }
}