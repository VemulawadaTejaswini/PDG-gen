import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        Map<Integer, String> map = new HashMap<>();

        while (scan.hasNextLine()) {
            map.put(scan.nextInt(), "trick");
            if (scan.hasNextLine()) {
                scan.nextLine();
                scan.nextLine();
            }
        }

        System.out.println(n - map.entrySet().size());
   }
}