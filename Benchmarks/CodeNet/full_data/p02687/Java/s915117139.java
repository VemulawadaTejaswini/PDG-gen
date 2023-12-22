
import java.util.*;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        new ABC166A().main();
    }
    static class ABC166A {
        public void main()
        {
            System.out.println(scanner.next().equals("ABC")?"ARC":"ABC");
        }
    }
}