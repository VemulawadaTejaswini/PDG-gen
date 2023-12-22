import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = (sc.next());
        String mul = s.substring(s.length() - 1).equals("s") ? "es" : "s";

        System.out.println(s + mul);
    }
}