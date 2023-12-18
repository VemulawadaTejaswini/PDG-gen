import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), yen = sc.nextInt() / 1000;
        int count = 0;
        int minX = yen / 10;
        count += 10 * minX;
        int minY = (yen - count) / 5;
        count += minY * 5;
        int minZ = yen - count;
        int sum = minX + minY + minZ;

        if (sum == n) {
            System.out.println(minX + " " + minY + " " + minZ);
        } else if (sum > n) {
            System.out.println("-1 -1 -1");
        } else {
            int diff = n - sum;
            if (minX * 9 + minY * 4 >= diff) {
                while (diff >= 9 && minX > 0) {
                    minX--;
                    minZ += 10;
                    diff -= 9;
                }
                while (diff >= 4 && minY > 0) {
                    minY--;
                    minZ += 5;
                    diff -= 4;
                }
                while (diff > 0 && minX > 0) {
                    minX--;
                    minY += 2;
                    diff -= 1;
                }
                System.out.println(minX + " " + minY + " " + minZ);
            } else {
                System.out.println("-1 -1 -1");
            }
        }
    }
}
