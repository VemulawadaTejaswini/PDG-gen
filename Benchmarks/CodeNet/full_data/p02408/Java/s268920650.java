import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int numOfCards = stdIn.nextInt();
  
        boolean[] spadeCardsExitsance = new boolean[13];
        boolean[] hartCardsExitsance = new boolean[13];
        boolean[] clubCardsExitsance = new boolean[13];
        boolean[] diamondCardsExitsance = new boolean[13];
  
        for(int i = 0; i < numOfCards; i++) {
            String suit = stdIn.next();
            int rank = stdIn.nextInt();
              
            switch(suit) {
            case "S":
                spadeCardsExitsance[rank - 1] = true;
                break;
            case "H":
                hartCardsExitsance [rank - 1] = true;
                break;
            case "C":
                clubCardsExitsance [rank - 1] = true;
                break;
            case "D":
                diamondCardsExitsance [rank - 1] = true;
                break;
            default:
                break;
            }
        }
  
        for(int i = 0; i < 13; i++) {
            if(!spadeCardsExitsance[i]) {
                System.out.println("S " + (i + 1));
            }
        }
        for(int i = 0; i < 13; i++) {
            if(!hartCardsExitsance[i]) {
                System.out.println("H " + (i + 1));
            }
        }
        for(int i = 0; i < 13; i++) {
            if(!clubCardsExitsance[i]) {
                System.out.println("C " + (i + 1));
            }
        }
        for(int i = 0; i < 13; i++) {
            if(!diamondCardsExitsance[i]) {
                System.out.println("D " + (i + 1));
            }
        }
    }
}