
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    String run() {
        int N = in.nextInt();
        switch (N % 10) {
            case 3:
                return "bon";
            case 0:
            case 1:
            case 6:
            case 8:
                return "pon";
            default:
                return "hon";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main().run());
    }
}
