import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean a = s.indexOf("A") > -1;
        boolean b = s.indexOf("B") > -1;
        System.out.println(a&b ? "Yes" : "No");
        sc.close();

    }

}
