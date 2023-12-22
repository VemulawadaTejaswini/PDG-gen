
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cardCount = Integer.parseInt(reader.readLine());
        String[][] card = new String[4][13];
        String[] CardPic = { "S","H","C","D"};

        for ( int xx = 0 ; xx <= 3 ; xx++ ) {
            for ( int yy = 0 ; yy <= 12 ; yy++ ) {
                card[xx][yy] = CardPic[xx];
            }
        }
        
        for (int i = 0; i < cardCount; i++) {
            String line = reader.readLine();
            String column[] = line.split(" ");
            if (column[0].equals("S")) {
                card[0][Integer.parseInt(column[1])-1] = null;
            }
            if (column[0].equals("H")) {
                card[1][Integer.parseInt(column[1])-1] = null;
            }
            if (column[0].equals("C")) {
                card[2][Integer.parseInt(column[1])-1] = null;
            }
            if (column[0].equals("D")) {
                card[3][Integer.parseInt(column[1])-1] = null;
            }
        }
        
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 12; y++) {
                if (card[x][y] != null) {
                    System.out.println(card[x][y] + " " + (y+1));
                }
            }
        }
    }
}