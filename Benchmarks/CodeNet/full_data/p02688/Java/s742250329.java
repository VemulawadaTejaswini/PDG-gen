import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        HashSet<Integer> hash = new HashSet<>();

        while (scan.hasNextLine()) {
            hash.add(scan.nextInt());
            if (scan.hasNextLine()) {
                scan.nextLine();
                scan.nextLine();
            }
        }

        System.out.println(n - hash.size());
   }
}