import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next().toUpperCase();
        String s = scanner.next().toUpperCase();
        int count = 0;
        while (!s.equals("END_OF_TEXT")) {
            if (s.equals(w)) count++;
            s = scanner.next().toUpperCase();
        }
        System.out.println(count);
    }
}
