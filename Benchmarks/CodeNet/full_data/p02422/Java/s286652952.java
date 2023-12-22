import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int n = Integer.parseInt(sc.next());

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            String bs = S.substring(0, a);
            String ms = S.substring(a, S.length() - (b - a) + a);
            String as = S.substring(S.length() - (b - a) + a);

            switch (op) {
                case "replace":
                    S = bs + sc.next() + as;
                    break;
                case "reverse":
                    StringBuilder tmp = new StringBuilder();
                    for (int j = ms.length() - 1; j >= 0; j--) {
                        tmp.append(ms.charAt(j));
                    }

                    S = bs + tmp.toString() + as;
                    break;
                case "print":
                    System.out.println(S.substring(a, b + 1));
                    break;
            }
        }
    }
}