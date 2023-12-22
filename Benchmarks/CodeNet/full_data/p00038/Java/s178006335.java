import java.io.*;
import java.util.*;

public class Main {
	String check( String card ) {
		String hand;
		int one = card.indexOf("1");
		int two = card.indexOf("2");
		System.out.println(card+" "+card.getClass());
		System.out.println(card.indexOf("4")+" "+card.indexOf("3")+" "+two+" "+one);
		if ( card.indexOf("4") != -1 )
			hand = "four card";
		else if ( card.indexOf("3") != -1 ) {
			if ( two != -1 )
				hand = "full house";
			else
				hand = "three card";
		} else if ( two != card.lastIndexOf("2") )
			hand = "two pair";
		else if ( two != -1 )
			hand = "one pair";
		else {
			for ( int i = one+1; i < one+5; i++ )
				if ( card.charAt(one) != card.charAt(i) ) return "null";
			hand = "straight";
		}
		return hand;
	}
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[\n,]");
		Main m = new Main();
		int[] cards;
		while ( sc.hasNext() ) {
			String card = "";
			cards = new int[13];
			for ( int i = 0; i < 5; i++ ) {
				int index = sc.nextInt() -2;
				if ( index == -1 ) index = 12;
				cards[index]++;
			} for ( int i = 0; i < cards.length; i++ )
				card += cards[i];
			String result = m.check(card);
			System.out.println(result);
		}
	}
}