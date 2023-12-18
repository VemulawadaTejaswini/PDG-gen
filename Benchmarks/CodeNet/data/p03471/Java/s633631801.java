import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int maxX = y / 10000;
        int maxY = y / 5000;
        int maxZ = y / 1000;
        boolean success = false;
out:
        for (int X = 0; X <= maxX; X++) {
            for (int Y = y - X * 10000; Y <= maxY; Y++) {
                for (int Z = y - X * 10000 - Y * 5000; Z <= maxZ; Z++) {
                    if (y == X * 10000 + Y * 5000 + Z * 1000) {
                        if (n == X + Y + Z) {
                            System.out.println(X + " " + Y + " " + Z);
                            success = true;
                            break out;
                        }
                    }
                }
            }
        }
        if (!success) {
            System.out.println("-1 -1 -1");
        }
        scanner.close();
    }
}
