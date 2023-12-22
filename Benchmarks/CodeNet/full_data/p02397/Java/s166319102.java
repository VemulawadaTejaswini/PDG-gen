import java.util.Scanner;

public class Main {

    static final String SPACE = " ";
    static final String RN = "\n";

    public static void main(String[] args) {
        // input
        int x;
        int y;

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int temp;

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            if (x > y) {
                sb.append(y).append(SPACE).append(x).append(RN);
            } else {
                sb.append(x).append(SPACE).append(y).append(RN);
            }
        }

        // output
        System.out.print(sb);
    }
}