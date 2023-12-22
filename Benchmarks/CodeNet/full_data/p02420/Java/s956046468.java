
import java.io.*;
import java.util.*;


class AlphabetCards{
	String cards;
	AlphabetCards(String cards){
		this.cards = cards;
	}
	void shuffleSomeCardsFromBottom(int numCards){
		cards = cards.substring(numCards) + cards.substring(0, numCards);
	}
	@Override
	public String toString(){
		return cards;
	}
}
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String line = "";
		while(true){
			line = scan.nextLine();
			if(line.charAt(0) == '-')
				return;
			AlphabetCards cards = new AlphabetCards(line);
			
			int shuffleTime = scan.nextInt();
			for(int i=0; i < shuffleTime; i++)
				cards.shuffleSomeCardsFromBottom(scan.nextInt());
			System.out.println(cards);
			scan.nextLine();
		}
	}
}