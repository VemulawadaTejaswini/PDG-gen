import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        List<String> strListOdd = Arrays.asList("R", "U", "D");
        List<String> strListEven = Arrays.asList("L", "U", "D");
        for (int i = 0; i < S.length(); i++) {
            String c = String.valueOf(S.charAt(i));
            if ((i % 2 == 0) && !strListOdd.contains(c) || (i % 2 == 1) && !strListEven.contains(c)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}