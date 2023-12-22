import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet hs = new HashSet();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            String input = sc.next();

            if (cmd.equals("insert")) {
                hs.add(input);
            } else if(cmd.equals("find")) {
                if (hs.contains(input)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
