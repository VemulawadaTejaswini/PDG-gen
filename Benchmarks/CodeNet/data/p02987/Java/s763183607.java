import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final char[] c = sc.next().toCharArray();

        if ((c[0] == c[1] && c[2] == c[3]) || (c[0] == c[2] && c[1] == c[3]) || (c[0] == c[3] && c[1] == c[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
