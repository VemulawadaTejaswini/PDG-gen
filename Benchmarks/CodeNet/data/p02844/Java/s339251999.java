import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String str = "" + s.charAt(i) + s.charAt(j) + s.charAt(k);
                    set.add(str);
                }
            }
        }

        System.out.println(set.size());

        sc.close();
    }

}
