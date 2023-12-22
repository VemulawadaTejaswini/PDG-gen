import java.util.*;

public class Main {
    private static final String[] MARKS = new String[]{"S", "H", "C", "D"};
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCards;
        char mark;  //S, H, C, D
        int number;
        int [][] cards = new int[4][13];
        
        numberOfCards = scanner.nextInt();
        for (int i = 0; i < numberOfCards; i++) {
            mark = scanner.next().charAt(0);
            number = scanner.nextInt();
            
            switch (mark) {
                case 'S' : {
                    cards[0][number] = 1;
                    break;
                }
                case 'H' : {
                    cards[1][number] = 1;
                    break;
                }
                case 'C' : {
                    cards[2][number] = 1;
                    break;
                }
                case 'D' : {
                    cards[3][number] = 1;
                    break;
                }
                default : {
                    break;
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if(cards[i][j] == 0) {
                    System.out.println(MARKS[i] + " " + j);
                }
            }
        }
    }
}