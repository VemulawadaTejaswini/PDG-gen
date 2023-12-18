import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String b = in.next();
            char c = b.charAt(0);
            System.out.println(c == 'A' ? 'T' : c == 'T' ? 'A' : c == 'C' ? 'G' : 'C');
        }
    }
}
