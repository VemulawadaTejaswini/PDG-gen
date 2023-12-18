import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        for (int i = -118; i <= 119; i++) {
            for (int j = -118; j <= 119; j++) {
                if (x == (long)Math.pow(i, 5) - (long)Math.pow(j, 5)) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}