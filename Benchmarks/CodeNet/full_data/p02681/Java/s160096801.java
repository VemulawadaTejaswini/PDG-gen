import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        if (s.length() + 1 == t.length()) {
            System.out.println("Yes");
        }else { 
            System.out.println("No");
        }
    }
}
