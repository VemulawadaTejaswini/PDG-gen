import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
	
	private final static String HEART = "H";
	private final static String SPADE = "S";
	private final static String CLUB  = "C";
	private final static String DIAMOND = "D";
	
	enum Suits {
		
		 SPADE(1,"S")
		,HEART(2,"H")
		,CLUB(3,"C")
		,DIAMOND(4,"D");
		
		private int rank;
		private String name;
		
		Suits(int rank,String name){
			this.rank = rank;
			this.name = name;
		}
		
		public int getRank(){
			return this.rank;
		}
		
		public String getAttrName(){
			return this.name;
		}
		
	}
	
	
	
	public static void main(String[] args){
		
		Map<String,HashSet<Integer>> cards = createCardBox();
		
		Scanner sc = new Scanner(System.in);
		
		int cardsInHand = Integer.parseInt(sc.next());
		
		for(int i = 0; i<cardsInHand;i++){
			
			String suits = sc.next();
			Integer number= Integer.parseInt(sc.next());
			
			HashSet<Integer> currentCards= cards.get(suits);
			currentCards.remove(number);
			
			cards.put(suits, currentCards);
		}
		
		printSuits(cards,SPADE);
		printSuits(cards,HEART);
		printSuits(cards,CLUB);
		printSuits(cards,DIAMOND);
		
		sc.close();
		
	}
	
	
	
	private static void printSuits(Map<String, HashSet<Integer>> cards,String suits) {
		
		HashSet<Integer> cardsInSuits; 
		cardsInSuits=  cards.get(suits);
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : cardsInSuits){
			
			list.add(i);
			
		}
		Collections.sort(list);
		
		for(Integer number : list){
			
			System.out.println(suits + " " + number);
		}
		
	}



	private static  Map<String,HashSet<Integer>> createCardBox(){
		
		Map<String,HashSet<Integer>> cards = new HashMap<String,HashSet<Integer>>();
		Set<String> suits = new HashSet<String>(){
			
			{add(HEART);}
			{add(SPADE);}
			{add(CLUB);}
			{add(DIAMOND);}
		};
		
		for(String suit: suits){
			
			HashSet<Integer> numbers = new HashSet<>();
			
			for(int j = 0; j<13;j++){
				
				numbers.add(j+1);
				
			}
			cards.put(suit, numbers);
		
		}
		
		return cards;
		
	}

}

