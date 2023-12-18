
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        scan.close();

        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            strSet.add(s[i]);
        }

        System.out.println(strSet.size());
    }
}
