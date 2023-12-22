import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); ++i) {
            System.out.print(converter(c[i]));
        }
        System.out.println("");
    }

    char converter(char c) {
        if (Character.isUpperCase(c))
            return Character.toLowerCase(c);
        if (Character.isLowerCase(c))
            return Character.toUpperCase(c);
        return c;
    }
}




