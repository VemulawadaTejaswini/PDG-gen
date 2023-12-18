import java.util.*;
import java.util.stream.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        boolean res = true;
        res &= s.indexOf("N") >= 0;
        res &= s.indexOf("W") >= 0;
        res &= s.indexOf("S") >= 0;
        res &= s.indexOf("E") >= 0;

        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
