/**
 * 
 * No.0038	Poker Hand
 * 
 * 
 * @author 	yuichirw <y.iky917@gmail.com>
 * @see		http://rose.u-aizu.ac.jp/onlinejudge/ProblemSet/description.jsp?id=0038&lang=jp
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] cards;
	
	static boolean read() {
		if(!sc.hasNext()) return false;
		String[] parsed = sc.next().split(",");
		cards = new int[5];
		for(int i = 0; i < 5; i++) {
			cards[i] = Integer.parseInt(parsed[i]);
		}
		return true;
	}
	
	static String solve() {
		
		char[] histgram = new char[14];
		
		for(int i = 0; i < 5; i++) {
			histgram[cards[i]]++;
		}
		
		Arrays.sort(histgram);
		int a,b;
		a = histgram[histgram.length - 1];
		b = histgram[histgram.length - 2];
		if(a == 4) {
			return "four card";
		}
		
		Arrays.sort(cards);
		boolean straight = false; int cnt = 0, c = 0, d = 0;
		for(int i = 0; i < 5; i++) {
			cnt = 0;
			for(int j = 0; j < 4; j++) {
				c = cards[(i+j)%5]; d = cards[(i+j+1)%5];
				if(abs(c-d) != 1 && abs(c-d) != 12) break;
				cnt++;
				if(abs(c-d) == 12 && cnt <= 4) break; 
			}
			if(cnt == 4) {
				straight = true;
				break;
			}
		}

		if(a == 3 && b == 2) {
			return "full house";
		}
		
		if(straight) {
			return "straight";
		}
		
		if(a == 3) {
			return "three card";
		}
		
		if(a == 2 && b == 2) {
			return "two pair";
		}
		
		if(a == 2) {
			return "one pair";
		}
		
		return "null";
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
}