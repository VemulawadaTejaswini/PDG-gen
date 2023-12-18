import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		ArrayList<Integer> cards = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++){
			cards.add(sc.nextInt());
		}
		Collections.sort(cards, Comparator.reverseOrder());
		Integer alice = 0;
		Integer bob = 0;
		for(int i = 0; i < n ; i = i + 2){
			alice = alice + cards.get(i);
		}
		for(int i = 1; i < n ; i = i + 2){
			bob = bob + cards.get(i);
		}
		Integer diff = alice - bob;
		System.out.println(diff);
	}
}