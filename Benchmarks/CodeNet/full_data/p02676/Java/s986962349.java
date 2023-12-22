import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());
            String str = scanner.nextLine();
            if (str.length() <= num) {
                System.out.println(str);
            } else {
                System.out.println(str.substring(0, num) + "...");
            }
    }
