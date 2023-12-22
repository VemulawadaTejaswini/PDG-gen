import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}

			String[] tmpArray = str.split(" ");

			GameManager gm = new GameManager();
			Player p1 = new Player(GameManager.PLAYER1, gm);

			gm.putCard(Integer.parseInt(tmpArray[0]), GameManager.PLAYER1);
			gm.putCard(Integer.parseInt(tmpArray[1]), GameManager.PLAYER1);
			gm.putCard(Integer.parseInt(tmpArray[2]), GameManager.PLAYER2);

			if(p1.decideDraw()){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}
}
class Player {
	GameManager gm;
	int name;

	public Player(int name, GameManager gm){
		this.gm = gm;
		this.name = name;
	}

	public boolean decideDraw(){
		ArrayList<Integer> myCards = gm.playersCards(this.name);
		ArrayList<Integer> invisibleCards = gm.invisibleCards(this.name);

		//????????????????¨?
		int sum = 0;
		for(int i = 0; i < myCards.size();i++){
			sum += myCards.get(i);
		}

		//System.out.println("Sum of My Cards "+sum);
		//20??\?????¨????????????????????°????±???????
		int safe = 0;
		for(int i = 0; i < invisibleCards.size() ; i++){
			if(sum + invisibleCards.get(i) <= 20){
				safe++;
			}
		}

		if((double)safe/invisibleCards.size() >= 0.5){
			return true;
		}
		else {
			return false;
		}
	}
}

class GameManager{
	static final int PLAYER1 = 1;
	static final int PLAYER2 = 2;
	static final int UNKNOWN = 3;

	Card[] cards = new Card[10];

	public GameManager(){
		for(int i = 0; i < cards.length ; i++){
			cards[i] = new Card();
		}
	}

	public void putCard(int num, int player){
		cards[num - 1].owner = player;
	}

	public ArrayList<Integer> invisibleCards(int player){
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < cards.length ; i++){
			if(cards[i].owner == UNKNOWN){
				list.add(cards[i].num);
			}
		}
		return list;
	}

	public ArrayList<Integer> playersCards(int player){
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < cards.length ; i++){
			if(cards[i].owner == player){
				list.add(cards[i].num);
			}
		}
		return list;
	}
}

class Card {
	private static int cnum = 1;
	int num;
	int owner;
	//	boolean visible;


	public Card(){
		num = cnum;
		cnum++;
		if(cnum == 11){
			cnum = 1;
		}
		owner = GameManager.UNKNOWN;
		//		visible = false;
	}

	public void setOwner (int owner){
		this.owner = owner;
	}
}