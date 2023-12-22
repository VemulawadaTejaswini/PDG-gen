import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            int len = str.length();
            for (int i = len - 1; 0 <= i; i--) {
                if (i == 0) {
                    System.out.println(str.charAt(i));
                } else {
                    System.out.print(str.charAt(i));
                }
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}