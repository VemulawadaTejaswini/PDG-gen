import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = new StringBuilder(sc.next()).reverse().toString();
        StringBuilder T = new StringBuilder();
        String U = S;
        while (true) {
            if (U.equals(T.toString())) {
                System.out.println("YES");
                return;
            } else if (S.startsWith(T+"remaerd")) {
                T.append("remaerd");
                continue;
            } else if (S.startsWith(T+"resare")) {
                T.append("resare");
                continue;
            } else if (S.startsWith(T+"maerd")) {
                T.append("maerd");
                continue;
            } else if (S.startsWith(T+"esare")) {
                T.append("esare");
                continue;
            }
            System.out.println("NO");
            return;
        }
    }
}
