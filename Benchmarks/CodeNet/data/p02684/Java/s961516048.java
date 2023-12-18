import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long k = scan.nextLong();

        int[] a = new int[n];

        for (int x = 0; x < n; x++) {
            a[x] = scan.nextInt();
        }

        int town = a[0];
        int unique = 0;
        List<Integer> list = new ArrayList<>();
        end:
        for (; 0 < k; k--) {
            for (unique = 0; unique < list.size(); unique++) {
                if (list.get(unique).equals(town)) {
                    break end;
                }
            }
            list.add(town);
            town = a[town - 1];
        }

        long left = (k - unique) % (list.size() - unique);
        
        if (left == 0) {
            System.out.println(list.get(unique));
            return;
        }

		System.out.println(list.get((int) left - 1));
    }
}
