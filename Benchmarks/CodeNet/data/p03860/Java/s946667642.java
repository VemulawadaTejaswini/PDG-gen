import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str1 = scanner.nextLine().split(" ");
        for (String s : str1) {
            System.out.print(s.substring(0, 1));
        }

        scanner.close();
    }
}
