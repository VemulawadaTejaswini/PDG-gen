import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int a1 = Integer.parseInt(line[0]);
        int a2 = Integer.parseInt(line[1]);
        int a3 = Integer.parseInt(line[2]);
        int a4 = Integer.parseInt(line[3]);
        int a5 = Integer.parseInt(line[4]);
        int a6 = Integer.parseInt(line[5]);

        int b = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < b; i++) {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int result = 0;
            if (c == a1 || c == a6) {
                if (d == a2) {
                    result = 3;
                } else if (d == a3) {
                    result = 5;
                } else if (d == a4) {
                    result = 2;
                } else {
                    result = 4;
                }
            } else if (c == a2 || c == a5) {
                if (d == a1) {
                    result = 4;
                } else if (d == a3) {
                    result = 1;
                } else if (d == a4) {
                    result = 6;
                } else {
                    result = 3;
                }
            } else {
                if (d == a1) {
                    result = 2;
                } else if (d == a2) {
                    result = 6;
                } else if (d == a5) {
                    result = 1;
                } else {
                    result = 5;
                }
            }
            if (c == a4 || c == a5 || c == a6) {
                result = 7 - result;
            }
            System.out.println(line[result - 1]);
        }
    }

}

