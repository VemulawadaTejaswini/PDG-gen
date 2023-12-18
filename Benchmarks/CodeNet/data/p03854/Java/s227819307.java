import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        String n = (new StringBuffer(s.next())).reverse().toString();
        String k[] = { "remaerd", "resare", "maerd", "esare"};
        boolean f = false;
        while (true) {
            f = false;
            for (int i = 0; i < k.length; i++) {
                if (n.startsWith(k[i])) {
                    n = n.replaceFirst(k[i], "");
                    f = true;
                }
            }
            if (!f) {
                break;
            }
        }
        System.out.println(n.equals("") ? "YES": "NO");

    }
}