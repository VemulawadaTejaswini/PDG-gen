import java.io.*;

class Card{

	public String mark;
	public int number;
	public int order;
	Card(String mark, int number, int order){
		this.mark = mark;
		this.number = number;
		this.order = order;
	}

	@Override
	public String toString(){
		return mark + " " + number;
	}
}

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Card[] cards = new Card[n];
		for(int i = 0; i < n; i++){
			String[] in = br.readLine().split(" ");
			cards[i] = new Card(in[0], Integer.parseInt(in[1]), i);
		}

		quickSort(cards, 0, n-1);
		System.out.printf("%s\n", isStable(cards, n)? "Stable" : "Not stable");
		for(Card card : cards){
			System.out.printf("%s\n", card);
		}
	}

	private static boolean isStable(Card[] c, int n){
		for(int i = 1; i < n; i++){
			if(c[i-1].number == c[i].number && c[i-1].order < c[i].order){
				return true;
			}
		}
		return false;
	}

	private static void quickSort(Card[] c, int p, int r){
		if(p < r){
			int q = partition(c, p, r);
			quickSort(c, p, q-1);
			quickSort(c, q+1, r);
		}
	}

	private static int partition(Card[] c, int p, int r){
		int x = c[r].number;
		int i = p-1;
		Card card;
		for(int j = p; j < r; j++){
			if(c[j].number <= x){
				i++;
				card = c[i];
				c[i] = c[j];
				c[j] = card;
			}
		}
		card = c[r];
		c[r] = c[i+1];
		c[i+1] = card;
		return i+1;
	}
}