import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String result = s.replaceAll("\\?", "D");
        System.out.println(result);
    }
}