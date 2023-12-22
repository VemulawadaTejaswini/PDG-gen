import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        for(int i = 0; i < number; i++){
            String line = input.nextLine();
            String suit = line.substring(0,1);
            String card = line.substring(2);
            deck.removeCard(suit, card);
        }
        deck.display();
    }
}

class Deck {
    public HashMap<String, List<String>> deck;
    public String[] suits;
    public Deck(){
        this.deck = new HashMap<>();
        this.suits = new String[]{"S","H","C","D"};

        // Add cards set with each suit
        for(String suit : suits){
            List<String> cards = new ArrayList<>();
            // Build cards
            for(int i = 1; i < 14; i++){
                cards.add(String.valueOf(i));
            }
            this.deck.put(suit, cards);
        }
    }

    public void removeCard(String suit, String card){
        this.deck.get(suit).remove(card);
    }

    public void display(){
        for(String suit : this.suits){
            if(this.deck.get(suit).size() != 0){
                for(String i: this.deck.get(suit)){
                    System.out.println(suit + " " + i);
                }
            }
        }
    }
}
