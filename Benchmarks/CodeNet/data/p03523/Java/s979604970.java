import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("A", "");
        if ("KIHBR".equals(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
