import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), hp = sc.nextInt();
        int[] dmgA = new int[n];
        Integer[] dmgB = new Integer[n];
        int maxA = 0;
        long sumB = 0;
        for (int i = 0; i < n; i++) {
            dmgA[i] = sc.nextInt();
            dmgB[i] = sc.nextInt();
            maxA = Math.max(maxA, dmgA[i]);
        }
        int count = 0;
        Arrays.sort(dmgB, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (maxA < dmgB[i] && sumB < hp) {
                sumB += dmgB[i];
                count++;
            }
        }
        if (sumB < hp) {
            hp -= sumB;
            int aCount = hp / maxA;
            count += aCount;
            hp -= aCount * maxA;
            if (hp > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
