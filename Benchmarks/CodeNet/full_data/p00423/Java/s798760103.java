import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			
			Game g = new Game(n);
			for(int i = 0; i < n; i++) g.addCards(sc.nextInt(), sc.nextInt());
			
			g.show();
		}
		sc.close();
	}
	
}

class Player{
	int[] cards;
	int point;
	private int cursor;
	
	
	public Player(int n){
		cards = new int[n];
		point = 0;
		cursor = 0;
	}
	
	public void addCard(int card){
		cards[cursor++] = card;
	}
	
	public void addPoint(int point){
		this.point += point;
	}

}

class Game{
	Player player1;
	Player player2;
	
	public Game(int n){
		player1 = new Player(n);
		player2 = new Player(n);
	}
	
	public void addCards(int c1, int c2){
		player1.addCard(c1);
		player2.addCard(c2);
		if(c1 > c2) player1.addPoint(c1 + c2);
		else if(c1 < c2) player2.addPoint(c1 + c2);
		else{
			player1.addPoint(c1);
			player2.addPoint(c2);
		}
	}
	
	public void show(){
		System.out.println(player1.point + " " + player2.point);
	}
}