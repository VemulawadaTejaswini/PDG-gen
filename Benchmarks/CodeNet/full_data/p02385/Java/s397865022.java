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
		int men1[] = new int[6];
		int men2[] = new int[6];
		for(int i = 0; i < 6; i++){
			men1[i] = scan.nextInt();
		}
		for(int i = 0; i < 6; i++){
			men2[i] = scan.nextInt();
		}
		//String meirei = scan.next();
		// TODO 自動生成されたメソッド・スタブ
		
		
		Dice d1 = new Dice(men1);
		Dice d2 = new Dice(men2);
		
		d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
		if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
			System.out.println("Yes");
		}else{
			d2.turnDice("S");
			d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
			if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
				System.out.println("Yes");
			}else{
				d2.turnDice("W");
				d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
				if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
					System.out.println("Yes");
				}else{
					d2.turnDice("S");
					d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
					if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
						System.out.println("Yes");
					}else{
						d2.turnDice("W");
						d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
						if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
							System.out.println("Yes");
						}else{
							d2.turnDice("S");
							d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
							if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
								System.out.println("Yes");
							}else{
								d2.turnDice("W");
								d2.turnDice(d1.getDiceMen(1), d1.getDiceMen(2));
								if(d1.getDiceMen(1) == d2.getDiceMen(1) && d1.getDiceMen(2) == d2.getDiceMen(2) && d1.getDiceMen(3) == d2.getDiceMen(3) && d1.getDiceMen(4) == d2.getDiceMen(4) && d1.getDiceMen(5) == d2.getDiceMen(5) && d1.getDiceMen(6) == d2.getDiceMen(6)){
									System.out.println("Yes");
								}else{
									System.out.println("No");
								}
							}
						}
					}
				}
			}
			
		}
		/*
		int count = scan.nextInt();
		for(int i = 0; i < count; i++){
			int tp = scan.nextInt(), fr = scan.nextInt();
			d1.turnDice(tp, fr);
			//d1.turnDice(meirei);
			System.out.println(d1.getDiceMen(3));
		}
		*/
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
		int nullBox, count = 0;
		while(this.diceMen[0] != tp && count < 10){
			turnDice("S");
			if(this.diceMen[0] == tp){
				break;
			}
			turnDice("W");
			count++;
		}
		count = 0;
		while(this.diceMen[1] != fr && count < 5){
			nullBox = diceMen[1];
			diceMen[1] = diceMen[2];
			diceMen[2] = diceMen[4];
			diceMen[4] = diceMen[3];
			diceMen[3] = nullBox;
			count++;
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
