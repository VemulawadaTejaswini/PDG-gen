import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	int n = Integer.parseInt(scanner.next());
    int m = Integer.parseInt(scanner.next());
    
    boolean[][] cards = new boolean[n][m];

    for (int i=0; i<cards.length; i++) {
		for (int j=0; j<cards[i].length; j++) {
		    cards[i][j] = !cards[i][j];

            if (i != 0) {
                if (j != 0) {
                    cards[i-1][j-1] = !cards[i-1][j-1];
                }
                
                cards[i-1][j] = !cards[i-1][j];
                
                if (j != cards[i].length-1) {
                    cards[i-1][j+1] = !cards[i-1][j+1];
                }
            }
            
            if (j != 0) {
                cards[i][j-1] = !cards[i][j-1];
            }
            
            cards[i][j] = !cards[i][j];
            
            if (j != cards[i].length-1) {
                cards[i][j+1] = !cards[i][j+1];
            }
            
            if (i != cards.length-1) {
                if (j != 0) {
                    cards[i+1][j-1] = !cards[i+1][j-1];
                }
                
                cards[i+1][j] = !cards[i+1][j];
                
                if (j != cards[i].length-1) {
                    cards[i+1][j+1] = !cards[i+1][j+1];
                }
            }            
        }
    }
    
    int count = 0;
    for (int i=0; i<cards.length; i++) {
        for (int j=0; j<cards[i].length; j++) {
            if (!cards[i][j]) {
                count++;
            }
        }
    }
    
    System.out.println(count);
  }
}