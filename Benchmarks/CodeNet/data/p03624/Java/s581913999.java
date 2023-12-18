import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans = "";

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder elem = new StringBuilder();

        for (int i = 0; i < alphabet.length; i++) {
            if (!s.contains(String.valueOf(alphabet[i]))) {
                elem.append(alphabet[i]);
                break;
            }
        }

        if (elem.length() == 0) {
            ans = "None";
        } else {
            ans = elem.toString();
        }


        System.out.println(ans);
    }
}