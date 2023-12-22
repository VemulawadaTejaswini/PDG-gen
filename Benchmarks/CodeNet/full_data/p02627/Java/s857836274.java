import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);
        char output = alphabet(input);
        System.out.println(output);
    }

    // alpha = 'B' -> 'A'
    // alpha = 'z' -> 'a'
    public static char alphabet(char alpha) {
        char result = 'a';
        if (alpha >= 'A' && alpha <= 'Z') {
            result = 'A';
        } else {
            result = 'a';
        }
        return result;
    }

}
