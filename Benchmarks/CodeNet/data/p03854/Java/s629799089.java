import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        while(true) {
            int length = string.length();
            if (length == 0) {
                System.out.println("YES");
                break;
            }
            if (length >= 5 && string.substring(length - 5, length).equals("dream")) {
                string = string.substring(0, length - 5);
            } else if (length >= 7 && string.substring(length - 7, length).equals("dreamer")) {
                string = string.substring(0, length - 7);
            } else if (length >= 5 && string.substring(length - 5, length).equals("erase")) {
                string = string.substring(0, length - 5);
            } else if (length >= 6 && string.substring(length - 6, length).equals("eraser")) {
                string = string.substring(0, length - 6);
            } else {
                System.out.println("NO");
                break;
            }
        }
    }
}
