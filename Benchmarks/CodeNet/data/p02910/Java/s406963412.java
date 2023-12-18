import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String out = "Yes";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == 'L') {
                    out = "No";
                    break;
                }
            } else {
                if (s.charAt(i) == 'R') {
                    out = "No";
                    break;
                }
            }
        }

        System.out.println(out);

        sc.close();
    }

}
