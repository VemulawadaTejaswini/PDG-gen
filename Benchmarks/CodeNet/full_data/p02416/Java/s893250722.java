import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.next();
            int length = str.length();
            if (str.charAt(0) == '0') break;
            int sum = 0;
            for (int i = 0; i < length; i++) {
               sum += str.charAt(i) - '0';
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}

