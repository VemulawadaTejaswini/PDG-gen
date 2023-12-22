import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		String[] dice = line1.split(" ", -1);
		int[] diceNum = new int[dice.length];
		for (int i = 0; i < dice.length; i++) {
			diceNum[i] = Integer.parseInt(dice[i]);
		} 
		String line2 = reader.readLine();
		char[] direction = line2.toCharArray();
		
		Dice.insert(diceNum);
		int rotate = rotation(diceNum,direction);
		System.out.println(rotate);
	}
	
	static int rotation(int[] dice,char[] chr) {
		int temp;
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == 'W') {
				//1>4 4>6 6>3 3>1
				temp = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = temp;
			} else if (chr[i] == 'E') {
				//1>3 3>6 6>4 4>1
				temp = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = temp;
			} else if (chr[i] == 'N') {
				//1>5 5>6 6>2 2>1
				temp = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = temp;
			} else if (chr[i] == 'S') {
				//1>2 2>6 6>5 5>1
				temp = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = temp;
			}
		}
		return dice[0];
	}
}