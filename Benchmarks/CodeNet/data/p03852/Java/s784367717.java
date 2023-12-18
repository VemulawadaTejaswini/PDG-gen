import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}