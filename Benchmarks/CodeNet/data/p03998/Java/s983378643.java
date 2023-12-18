import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sa = scanner.next();
        String sb = scanner.next();
        String sc = scanner.next();

        int currentPlayer = 0; // 0 = A, 1 = B, 2 = C
        while (true) {
//            System.out.print("currentPlayer : " + currentPlayer);
//            System.out.print("sa : " + sa);
//            System.out.print("sb : " + sb);
//            System.out.print("sc : " + sc);

            char nextPlayer = 'a';
            switch (currentPlayer) {
                case 0: {
                    if (sa.isEmpty()) {
                        // A is win
                        System.out.print("A");
                        return;
                    }
                    nextPlayer = sa.charAt(0);
                    sa = sa.substring(1);
                    break;
                }
                case 1: {
                    if (sb.isEmpty()) {
                        // A is win
                        System.out.print("B");
                        return;
                    }
                    nextPlayer = sb.charAt(0);
                    sb = sb.substring(1);
                    break;
                }
                case 2: {
                    if (sc.isEmpty()) {
                        // A is win
                        System.out.print("C");
                        return;
                    }
                    nextPlayer = sc.charAt(0);
                    sc = sc.substring(1);
                    break;
                }
            }

            if (nextPlayer == 'a') {
                currentPlayer = 0;
            } else if (nextPlayer == 'b') {
                currentPlayer = 1;
            } else if (nextPlayer == 'c') {
                currentPlayer = 2;
            }
        }
    }
}
