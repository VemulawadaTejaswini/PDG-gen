


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Card[] cards = new Card[n];
		for (int i=0;i<n;i++) {
			cards[i]=new Card();
			cards[i].id=i+1;
		}
		for (int i=0;i<n;i++) {
			cards[i].red=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			cards[i].blue=sc.nextInt();
		}
		
		int ans = -1;
		
		for (int i=0;i<(1<<n);i++) {
			ArrayList<Card> odd = new ArrayList<>();
			ArrayList<Card> even = new ArrayList<>();
			for (int j=0;j<n;j++) {
				cards[j].showing=((i>>j)%2!=0 ? cards[j].blue : cards[j].red);
				if ((i>>j)%2!=0 ^ j%2==0) {
					odd.add(cards[j]);
				} else {
					even.add(cards[j]);
				}
			}
			if (odd.size() != (n+1)/2) {
				continue;
			}
			odd.sort(Comparator.comparing((Card c) -> c.showing).thenComparing((Card c) -> c.id));
			even.sort(Comparator.comparing((Card c) -> c.showing).thenComparing((Card c) -> c.id));
			
			int last = 0;
			ArrayList<Card> combined = combine(odd,even,n);
			boolean ok = true;
			for (int j=0;j<n-1;j++) {
				if(combined.get(j).showing>combined.get(j+1).showing){
					ok=false;
					break;
				}
			}
			
			if (ok) {
				int count = 0;
				for (int j=0;j<n;j++) {
					for (int k=j+1;k<n;k++) {
						if(combined.get(j).id>combined.get(k).id) {
							count++;
						}
					}
				}
				if (ans==-1 || count<ans) {
					ans=count;
				}
			}
		}
		
		System.out.println(ans);
	}
	static ArrayList<Card> combine (ArrayList<Card> odd, ArrayList<Card>even, int n) {
		ArrayList<Card> ret = new ArrayList<>();
		for (int i=0;i<n;i++) {
			ret.add(i%2==0 ? odd.get(i/2) : even.get(i/2));
		}
		return ret;
	}
}

class Card {
	int id;
	int red;
	int blue;
	int showing;
}



