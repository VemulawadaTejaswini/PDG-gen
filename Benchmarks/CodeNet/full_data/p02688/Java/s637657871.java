import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        HashSet<Integer> hash = new HashSet<>();

        for (int x = 0; x < k; x++) {
            int inner = scan.nextInt();
            for (int y = 0; y < inner; y++) {
                hash.add(scan.nextInt());
            }
        }

        System.out.println(n - hash.size());
   }
}