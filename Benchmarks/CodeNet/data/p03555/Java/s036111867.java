import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "NO";

        char[] firstLine = scanner.next().toCharArray();
        char[] secondLine = scanner.next().toCharArray();

        if (firstLine[0] == secondLine[2] && firstLine[1] == secondLine[1] && firstLine[2] == secondLine[0]) {
            result = "YES";
        }

        System.out.println(result);
    }
}
