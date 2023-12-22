import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        boolean[][] cards = new boolean[4][13];

        for(int i=0; i<n; i++) {
            char kind = sc.next().charAt(0);
            int num = sc.nextInt();
            switch(kind) {
                case 'S':
                    cards[0][num-1] = true;
                    break;
                case 'H':
                    cards[1][num-1] = true;
                    break;
                case 'C':
                    cards[2][num-1] = true;
                    break;
                case 'D':
                    cards[3][num-1] = true;
                    break;
            }
        }

        char[] kinds = {'S', 'H', 'C', 'D'};
        for(int i=0; i<4; i++) {
            for(int j=0; j<13; j++) {
                if(!cards[i][j]) {
                    System.out.println(kinds[i] + " " + (j+1));
                }
            }
        }
    }
}

