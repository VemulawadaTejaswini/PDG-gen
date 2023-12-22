import java.util.Scanner;

public class Main {
	Dice dice;
	void run(){
		Scanner s = new Scanner(System.in);
		int[] num = new int[6];
		for(int i = 0;i < num.length;i++){
			num[i] = s.nextInt();
		}
		dice = new Dice(num);
		String str = s.next();
		for(int i = 0;i < str.length();i++){
			dice.label = dice.roll(str.substring(i,i+1));
		}
		dice.printTop();
	}
	public static void main(String args[]){
		new Main().run();
	}
}