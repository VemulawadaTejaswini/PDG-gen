import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.charAt(str.length()-1) == 's') {
            str += "es";
        } else {
            str += "s";
        }
        System.out.println(str);
    }
}
