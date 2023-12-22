import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		boolean[][] cards = new boolean[4][13];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < cards.length; i++) {
			Arrays.fill(cards[i], false);
		}
		
		//input
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			char suit= sc.next().charAt(0);
			int num = sc.nextInt();
			cards[suitToIndex(suit)][numToIndex(num)] = true;
		}
		sc.close();
		
		//output
		for(int i = 0; i < cards.length; i++) {
			for(int j = 0; j < cards[0].length; j++) {
				if(!cards[i][j]) System.out.println(indexToSuit(i) + " " + indexToNum(j));
			}
		}
	}

	static int suitToIndex(char suit) {
		switch(suit) {
			case 'S':
				return 0;
			case 'H':
				return 1;
			case 'C':
				return 2;
			case 'D':
			default:
				return 3;
		}
	}
	
	static char indexToSuit(int i) {
		if(i == 0) return 'S';
		else if(i == 1) return 'H';
		else if(i == 2) return 'C';
		else return 'D';
	}
	
	static int numToIndex(int n) {
		return n-1;
	}
	
	static int indexToNum(int i) {
		return i + 1;
	}
}