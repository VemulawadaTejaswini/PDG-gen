import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String deck = "";
        boolean flag = true;
        while (true) {
            // grab and convert the string to lowercase
            String line = input.nextLine();
            if (line.equals("-")) {
                System.out.println(deck);
                break;
            }
            // This line checks to see if a new deck has been introduced by looking at length, also grabs the case where the deck is just on card
            if (Character.isAlphabetic(line.charAt(0))) {
                if (!deck.equals("")) System.out.println(deck);
                deck = line;
                flag = true;
            } else if(flag){
                flag = false;
                // ignore this value, we approached this in a different way
            } else {
                int h = Integer.parseInt(line);
                deck = deck.substring(h) + deck.substring(0, h);
            }
        }
    }
}
