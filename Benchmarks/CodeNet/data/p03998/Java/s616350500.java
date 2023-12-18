
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SA = sc.next();
        String SB = sc.next();
        String SC = sc.next();

        int iA = 0;
        int iB = 0;
        int iC = 0;
        char player = 'a';
        while (player == 'a' && iA < SA.length() || player == 'b' && iB < SB.length()
                || player == 'c' && iC < SC.length()) {
            // System.out.println(String.format("%c : %d %d %d", player, iA, iB, iC));
            switch (player) {
            case 'a':
                player = SA.charAt(iA);
                iA += 1;
                break;
            case 'b':
                player = SB.charAt(iB);
                iB += 1;
                break;
            case 'c':
                player = SC.charAt(iC);
                iC += 1;
                break;
            }
        }
        System.out.println(String.valueOf(player).toUpperCase());
    }
}