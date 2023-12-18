import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String s = scanner.next();
        String t = scanner.next();
        boolean res = t.length() == s.length()+1 && t.substring(0, t.length()-1).equals(s);
        System.out.print(res ? "Yes" : "No");
    }
}
