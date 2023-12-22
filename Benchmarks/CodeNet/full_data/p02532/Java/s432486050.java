import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static String[] decks = new String[100];
	private static ArrayList<String> blocksRemoved = new ArrayList<String>();
	
	public static void main(String[] args) {
		int deck = sc.nextInt();
		
		while(sc.hasNext()){
			if(manipulation(sc.next())){
				//³íÉìªsíêÄ¢éÈçA½àµÈ¢
			}
			else{
				break;
			}
		}
		
		for(int i = 0; i < blocksRemoved.size(); i++){
			System.out.println(blocksRemoved.get(i));
		}
	}
	
	public static boolean manipulation(String input){
		if(input.compareTo("push") == 0){
			push();
			return true;
		}
		else if(input.compareTo("pop") == 0){
			pop();
			return true;
		}
		else if(input.compareTo("move") == 0){
			move();
			return true;
		}
		else if(input.compareTo("quit") == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	private static void push(){
		int index = sc.nextInt() - 1;
		String block = sc.next();
		String deck = decks[index];
		String newDeck = deck + block;
		decks[index] = newDeck;
	}
	
	private static void pop(){
		int index = sc.nextInt() - 1;
		String deck = decks[index];
		String block = String.valueOf(deck.charAt(deck.length() - 1));
		String newDeck = deck.substring(0, deck.length() - 1);
		blocksRemoved.add(block);
		decks[index] = newDeck;
	}
	
	private static void move(){
		int indexRemoveFromDeck = sc.nextInt() - 1;
		String deckFrom = decks[indexRemoveFromDeck];
		String block = String.valueOf(deckFrom.charAt(deckFrom.length() - 1));
		String newDeckFrom = deckFrom.substring(0, deckFrom.length() - 1);
		decks[indexRemoveFromDeck] = newDeckFrom;
		
		int indexAddToDeck = sc.nextInt() - 1;
		String deckTo = decks[indexAddToDeck];
		String newDeckTo = deckTo + block;
		decks[indexAddToDeck] = newDeckTo;
	}
}