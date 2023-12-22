import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // suit S', 'H', 'C' and 'D'
        int[] s = new int[13];
        int[] h = new int[13];
        int[] c = new int[13];
        int[] d = new int[13];
        Arrays.fill(s, 0);
        Arrays.fill(h, 0);
        Arrays.fill(c, 0);
        Arrays.fill(d, 0);

        String[] suit;
        scanner.next();
        while (scanner.hasNext()) {
            suit = scanner.nextLine().split(" ");

            switch (suit[0]) {
            case "S":
                s[Integer.parseInt(suit[1]) - 1] = 1;
                break;
            case "H":
                h[Integer.parseInt(suit[1]) - 1] = 1;
                break;
            case "C":
                c[Integer.parseInt(suit[1]) - 1] = 1;
                break;
            case "D":
                d[Integer.parseInt(suit[1]) - 1] = 1;
                break;
            default:
                break;
            }

        }

        output(s, "S");
        output(h, "H");
        output(c, "C");
        output(d, "D");

        scanner.close();
    }

    private static void output(int[] values, String suit) {
        for (int i = 0; i < 13; i++) {
            if (values[i] == 0) {
                System.out.printf("%s %d%n", suit, i + 1);
            }
        }
    }

}

