import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long k = scan.nextLong();

        int[] a = new int[n];

        Arrays.setAll(a, x -> scan.nextInt());

        Map<Integer, Integer> map = new HashMap<>();
        for (int turn = 1, teleport = a[0]; k > 0; k--, turn++) {
            if (map.getOrDefault(teleport, 0) > 0) {
                k %= turn - map.get(teleport);
            }

            if (k <= 1) {
                System.out.println(teleport);
                return;
            }
            
            map.put(teleport, turn);
            teleport = a[teleport - 1];
        }
    }
}
