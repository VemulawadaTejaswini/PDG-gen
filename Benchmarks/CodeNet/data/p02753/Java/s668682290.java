import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        if (s.indexOf('A') != -1 && s.indexOf('B') != -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
