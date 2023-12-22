import java.util.NoSuchElementException;
import java.util.Scanner;

public class CardGame {
    private static int N = 1000;
    private static int S = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int ap = 0, bp = 0;
            int n = Integer.parseInt(sc.nextLine());
            while (sc.hasNext()) {
                String[] cs = sc.nextLine().split(" ");
                if (n > N || cs[0].length() > S || cs[1].length() > S) {
                    System.out.println("Condition is invalid.");
                }
                switch (cs[0].compareTo(cs[1])) {
                    case 1:
                        ap += 3;
                        break;
                    case 0:
                        ap++;
                        bp++;
                    case -1:
                        bp += 3;
                        break;
                }
            }
            System.out.println(ap + " " + bp);
        } catch (NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }
}

