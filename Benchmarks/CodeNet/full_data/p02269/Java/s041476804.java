import java.util.Scanner;
import java.util.HashSet;;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<String>();

        for (int i=0; i<n; ++i) {
            String dir = sc.next();
            String s = sc.next();
            if (dir.equals("insert")) {
                set.add(s);
            } else {
                System.out.println((set.contains(s) ? "yes" : "no"));
            }
        }
        sc.close();
    }
}

