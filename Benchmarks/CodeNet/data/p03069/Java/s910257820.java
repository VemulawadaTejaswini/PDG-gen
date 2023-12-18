
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        String t = s.substring(k - 1, k);
        String an = "";
        for (int i = 0 ; i < n ; i++) {
            if (!s.substring(i, i + 1).equals(t)) {
                an += "*";
            } else {
                an += t;
            }
        }

        System.out.println(an);
    }

}