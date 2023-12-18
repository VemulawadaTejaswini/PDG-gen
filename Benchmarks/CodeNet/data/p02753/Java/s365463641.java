import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean e = scanner.next().chars().distinct().count() == 1;
        System.out.println(e ? "No" : "Yes");
    }
}