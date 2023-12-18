import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        String replaced = S
                .replaceAll("eraser", "")
                .replaceAll("erase", "")
                .replaceAll("dreamer", "")
                .replaceAll("dream", "");
        System.out.println(replaced.length()==0 ? "YES" : "NO");
    }
}
