import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		String cardSet;
		Bonze b;
		
		for(;;) {
			N = sc.nextInt();
			if(N == 0) {
				break;
			}
			cardSet = sc.next();
			b = new Bonze(cardSet,N);
			System.out.println(b.getResult());
		}
	}
}

class Bonze {
	private String cardSet;
	private int N,fieldScore,current,currentCard;
	private int[] score;
	
	public Bonze(String cardSet,int N) {
		this.cardSet = cardSet;
		this.N = N;
		fieldScore = 0;
		current = 0;
		score = new int[N];
	}
	
	public String getResult() {
		game();
		String result = "";
		Arrays.sort(score);
		for(int s:score) {
			result += s + " ";
		}
		result += fieldScore;
		return result.trim();
	}
	
	private void game() {
		for(int i=0; i<100; i++) {
			currentCard = i;
			draw();
			current ++;
			if(current == N) {
				current = 0;
			}
		}
	}
	
	private void draw() {
		String next = cardSet.charAt(currentCard)+"";
		if(next.equals("M")) {
			man();
		} else if(next.equals("S")) {
			bonze();
		} else if(next.equals("L")) {
			princess();
		}
	}
	
	private void man() {
		score[current] ++;
	}
	
	private void bonze() {
		fieldScore += score[current] + 1;
		score[current] = 0;
	}
	
	private void princess() {
		score[current] += fieldScore + 1;
		fieldScore = 0;
	}
}