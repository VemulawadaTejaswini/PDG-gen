import java.util.Map;
import java.util.Scanner;

import d.Dice;

public class Main {
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	Dice dice = new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());

		String str = scan.next();
		for(int i=0;i<str.length();i++){
			dice.rollDice(String.valueOf(str.charAt(i)));
		}

		Map<String,Integer> dicenum =dice.getDice();
		
		System.out.println(dicenum.get("top"));
		

	}
}