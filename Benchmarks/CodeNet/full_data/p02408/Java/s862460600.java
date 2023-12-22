import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[][] cards = new int[4][13];

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 13; y++) {
                cards[x][y] = 1;
            }
        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        for (int i = 0; i < n; i++) {
            String mark = scn.next();
            int num = scn.nextInt();
            int m;

            switch (mark) {
                case "S":
                    m = 0;
                    break;
                case "H":
                    m = 1;
                    break;
                case "C":
                    m = 2;
                    break;
                default:
                    m = 3;
                    break;
            }

            cards[m][num - 1] = 0;

        }

        for (int l = 0; l < 4; l++) {
            for (int j = 0; j < 13; j++) {
                if (cards[l][j] == 1) {
                    String mark2;
                    switch (l) {
                        case 0:
                            mark2 = "S";
                            break;
                        case 1:
                            mark2 = "H";
                            break;
                        case 2:
                            mark2 = "C";
                            break;
                        default:
                            mark2 = "D";
                            break;
                    }
                    System.out.println(mark2 + " " + (j + 1));
                }
            }

        }

        scn.close();

    }


}
