import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> numCardsShuffle = new ArrayList<Integer>();
	private static ArrayList<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		doShuffles();
		printResult(result);
	}
	
	public static void doShuffles(){
		while(sc.hasNext()){
			String cards= getCards();
			if(cards == null){
				break;
			}
			setShuffleDetail();
			result.add(getCardsShuffled(cards, numCardsShuffle));
			numCardsShuffle.clear();
		}
	}
	
	private static String getCards(){
		//ÅÌÀÑð çí·¶ñðæ¾·é
		String cards = sc.next();
		
		//üÍI¹¶i-jÈçVbtÌ[v©ç²¯é
		if(cards.compareTo("-") == 0){
			return null;
		}
		
		return cards;
	}
	private static void setShuffleDetail(){
		//Vbtñð¾é
		int numShuffle = sc.nextInt();
	
		//½º©çÆé©¾é
		for(int i = 0; i < numShuffle; i++){
			numCardsShuffle.add(sc.nextInt());
		}
	}
	
	public static String getCardsShuffled(String str, ArrayList<Integer> num){
		String deck = str;
		for(int i = 0; i < num.size(); i++){
			String downDeck = deck.substring(0, num.get(i));
			String upDeck = deck.substring(num.get(i), str.length());
			deck = upDeck + downDeck;
		}
		return deck;
	}
	
	private static void printResult(ArrayList<String> result){
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}