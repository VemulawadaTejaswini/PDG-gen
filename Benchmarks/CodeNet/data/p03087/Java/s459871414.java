import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        Pattern pattern = Pattern.compile("AC");

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            String str = s.substring(l, r);
            String tmp = pattern.matcher(str).replaceAll("");
            System.out.println((str.length() - tmp.length()) / 2);

        }
        sc.close();

    }
}