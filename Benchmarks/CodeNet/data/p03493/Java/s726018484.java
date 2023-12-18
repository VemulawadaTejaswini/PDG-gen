import java.util.*;

public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           String s = scanner.next();
           s = s.replaceAll("0", "");
           System.out.println(s.length());
    }
}