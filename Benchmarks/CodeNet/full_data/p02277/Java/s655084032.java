import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.HashMap;


public class Main {
	public static final String EOF = System.lineSeparator();
	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
/*
		System.out.println((l2-l)+"msec");
//*/		
	}
	
	public void exec() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StableChecker sc = new StableChecker();
		int n = Integer.parseInt(br.readLine());
		Card[] A = new Card[n];
		for(int i=0; i<n; i++) {
			sc.set(A[i] = new Card(br.readLine()));
		}
		quickSort(A,0,n-1);
		out.println(sc.check(A) ? "Stable" : "Not Stable");
		StringBuilder sb = new StringBuilder();
		for(Card c : A) {
			c.appendStringBuilder(sb);
			sb.append(EOF);
		}
		out.print(sb);
		out.flush();
	}
	
	private void quickSort(Card[] A, int p, int r) {
		if(p < r) {
			int q = partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	
	private int partition(Card[] A, int p, int r) {
		Card x = A[r];
		int i=p;
		for(int j=i; j<r; j++) {
			if(A[j].number <= x.number) {
				Card tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				i++;
			}
		}
		A[r] = A[i];
		A[i] = x;
		return i;
	}
}

class StableChecker { 
	HashMap<Integer,ArrayDeque<Character>> map = new HashMap<>();

	public void set(Card c) {
		if(map.containsKey(c.number)){
			map.get(c.number).add(c.suit);
		}else{
			ArrayDeque<Character> q = new ArrayDeque<>();
			q.add(c.suit);
			map.put(c.number, q);
		}
	}
	
	public boolean check(Card[] A) {
		for(Card c: A) {
			if(map.containsKey(c.number)){
				Character c2 = map.get(c.number).pop();
				if(!c2.equals(c.suit)){
					return false;
				}
			}
		}
		return true;
	}
}

class Card {
	char suit;
	int number;
	
	public Card(String str) {
		suit = str.charAt(0);
		number = Integer.parseInt(str.substring(2));
	}
	
	public void appendStringBuilder(StringBuilder sb) {
		sb.append(suit).append(" ").append(number);
	}
}