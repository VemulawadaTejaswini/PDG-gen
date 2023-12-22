import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        boolean cards[][] = new boolean [4][13];

        int numCards = sc.nextInt();

        for (int x = 0; x < numCards; x++) {
            char suit = sc.next().charAt(0);
            int rank = sc.nextInt();

            switch (suit) {
                case 'S':
                    cards[0][rank - 1] = true;
                    break;
                case 'H':
                    cards[1][rank - 1] = true;
                    break;
                case 'C':
                    cards[2][rank - 1] = true;
                    break;
                case 'D':
                    cards[3][rank - 1] = true;
                    break;
            }
        }

        String[] suits = {"S", "H", "C", "D"};

        for (int s = 0; s < 4; s++) {
            for (int r = 0; r < 13; r++) {
                if (!cards[s][r])   System.out.printf("%s %d\n", suits[s], r+1);
            }
        }


    }
}