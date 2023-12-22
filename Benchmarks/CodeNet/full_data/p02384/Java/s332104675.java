import java.util.Scanner;
/**
 * 
 */

/**
 * @author saiyo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int men[] = new int[6];
		for(int i = 0; i < 6; i++){
			men[i] = scan.nextInt();
		}
		//String meirei = scan.next();
		// TODO 自動生成されたメソッド・スタブ
		
		
		Dice d1 = new Dice(men);
		int count = scan.nextInt();
		for(int i = 0; i < count; i++){
			int tp = scan.nextInt(), fr = scan.nextInt();
			d1.turnDice(tp, fr);
			//d1.turnDice(meirei);
			System.out.println(d1.getDiceMen(3));
		}
	}

}


class Dice{
	private int diceMen[] = new int[6];
	
	Dice(int men[]){
		for(int i = 0; i < 6; i++)
			this.diceMen[i] = men[i];
	}
	
	public int getDiceMen(int m){
		return this.diceMen[m - 1];
	}
	
	public void turnDice(int tp, int fr){
		int nullBox;
		while(this.diceMen[0] != tp){
			turnDice("S");
			if(this.diceMen[0] == tp){
				break;
			}
			turnDice("W");
		}
		while(this.diceMen[1] != fr){
			nullBox = diceMen[1];
			diceMen[1] = diceMen[2];
			diceMen[2] = diceMen[4];
			diceMen[4] = diceMen[3];
			diceMen[3] = nullBox;
			
		}
	}
	
	public void turnDice(String mei){
		int nullBox;
		char[] stWord = stlipWord(mei);
		for(char word: stWord){
			switch(word){
			case 'S':
				nullBox = this.diceMen[0];
				this.diceMen[0] = this.diceMen[4];
				this.diceMen[4] = this.diceMen[5];
				this.diceMen[5] = this.diceMen[1];
				this.diceMen[1] = nullBox;
				break;
			case 'E':
				nullBox = this.diceMen[0];
				this.diceMen[0] = this.diceMen[3];
				this.diceMen[3] = this.diceMen[5];
				this.diceMen[5] = this.diceMen[2];
				this.diceMen[2] = nullBox;
				break;
			case 'W':
				nullBox = this.diceMen[0];
				this.diceMen[0] = this.diceMen[2];
				this.diceMen[2] = this.diceMen[5];
				this.diceMen[5] = this.diceMen[3];
				this.diceMen[3] = nullBox;
				break;
			case 'N':
				nullBox = this.diceMen[0];
				this.diceMen[0] = this.diceMen[1];
				this.diceMen[1] = this.diceMen[5];
				this.diceMen[5] = this.diceMen[4];
				this.diceMen[4] = nullBox;
				break;
			}
		}
		
	}
	
	public char[] stlipWord(String mei){
		char[] stlipWord = new char[mei.length()];
		for(int i = 0; i < mei.length(); i++){
			stlipWord[i] = mei.charAt(i);
		}
		return stlipWord;
	}
	
}
