import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> tall = new ArrayList<>();
        for (int x = 0; x < n; x++) {
            tall.add(scan.nextInt());
        }

        int count = 0;
        for (int y = 0; y < n; y++) {
            for (int z = y + 1; z < n; z++) {
                if (Math.abs(y - z) == tall.get(y) + tall.get(z)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}