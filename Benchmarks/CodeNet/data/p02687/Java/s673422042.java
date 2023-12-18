import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(problem166a(s));
    }

    private static String problem166a(String s) {
        return (Objects.equals(s, "ABC")) ? "ARC" : "ABC";
    }
}