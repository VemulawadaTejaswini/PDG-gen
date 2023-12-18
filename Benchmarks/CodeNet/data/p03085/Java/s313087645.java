
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.next();
        String res = "";
        for (int i = 0; i < b.length(); ++i) {
            if (b.charAt(i) == 'A') {
                res += 'T';
            } else if (b.charAt(i) == 'T') {
                res += 'A';
            } else if (b.charAt(i) == 'C') {
                res += 'G';
            } else {
                res += 'C';
            }
        }
        System.out.println(res);
    }
}
