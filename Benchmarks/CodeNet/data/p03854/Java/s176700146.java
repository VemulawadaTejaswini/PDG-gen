import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = new StringBuilder(sc.next()).reverse().toString();
        String T = "";
        String U = S;
        while (true) {
            if (T.equals(U)) {
                System.out.println("YES");
                return;
            } else if (S.startsWith(T+"remaerd")) {
                T += "remaerd";
                continue;
            } else if (S.startsWith(T+"resare")) {
                T += "resare";
                continue;
            } else if (S.startsWith(T+"maerd")) {
                T += "maerd";
                continue;
            } else if (S.startsWith(T+"esare")) {
                T += "esare";
                continue;
            }
            System.out.println("NO");
            return;
        }
    }
}
