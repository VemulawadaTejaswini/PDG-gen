import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String S = cin.next().toLowerCase();
        int x = 0;
        for (int i = 97; i <= 97 + 25; i++) {
            if (!S.contains((char)i + "")) {
                x = i;
                break;
            }
        }

        if (x == 0) {
            System.out.println("None");
        } else {
            System.out.println((char)x);
        }
    }
}