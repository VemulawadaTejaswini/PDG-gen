import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int count = Integer.parseInt(br.readLine());
        int[][] allCard = new int[4][13];
        for (int i = 0; i < count; i++) {
            String[] card = br.readLine().split(" ");
            int j = Integer.parseInt(card[1]) - 1;
            if (card[0].equals("S"))
                allCard[0][j] = 1;
            if (card[0].equals("H"))
                allCard[1][j] = 1;
            if (card[0].equals("C"))
                allCard[2][j] = 1;
            if (card[0].equals("D"))
                allCard[3][j] = 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (allCard[i][j] != 1) {
                    if (i == 0) {
                        sb.append("S" + " " + (j + 1) + '\n');
                    }
                    if (i == 1) {
                        sb.append("H" + " " + (j + 1) + '\n');
                    }
                    if (i == 2) {
                        sb.append("C" + " " + (j + 1) + '\n');
                    }
                    if (i == 3) {
                            sb.append("D" + " " + (j + 1) + '\n');
                    }
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}