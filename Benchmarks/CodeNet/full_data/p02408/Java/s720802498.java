import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] cards = new boolean[4][13];
        String[] card;
        int i, j;
        char c;
        for (i = 0; i < 4; i++) for (j = 0; j < 13; j++) cards[i][j] = false;
        for (i = 0; i < n; i++) {
            card = br.readLine().split(" ");
            if (card[0].equals("S")) {
                cards[0][Integer.parseInt(card[1]) - 1] = true;
            } else if (card[0].equals("H")) {
                cards[1][Integer.parseInt(card[1]) - 1] = true;
            } else if (card[0].equals("C")) {
                cards[2][Integer.parseInt(card[1]) - 1] = true;
            } else if (card[0].equals("D")) {
                cards[3][Integer.parseInt(card[1]) - 1] = true;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 13; j++) {
                if (!cards[i][j]) {
                    if (i == 0) c = 'S';
                    else if (i == 1) c = 'H';
                    else if (i == 2) c = 'C';
                    else c = 'D';
                    System.out.println(c + " " + (j + 1));
                }
            }
        }
    }
}