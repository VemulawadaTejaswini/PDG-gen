import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = String.valueOf(scanner.next());
        string = string + "0";
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            for(int j = string.length() - 1; j >= i; j--) {
                try {
                    long number = Long.parseLong(string.substring(i, j));
                    System.out.println(number);
                    if(number % 2019 == 0) {
                        count += 1;
                    }
                }
                catch (NumberFormatException n) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
