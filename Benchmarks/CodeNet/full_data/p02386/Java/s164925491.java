import java.util.Scanner;

class Dice{
	int[] dice = new int[7];
	int[] dice2 = new int[7];
	
	void diceroll(char[] roll)
	{
		for(int i = 0;i < roll.length;i++)
		{
			int temp =0;
			if(roll[i] == 'N'){
				temp = dice[1];
				dice[1] = dice[2];
				dice[2] = dice[6];
				dice[6] = dice[5];
				dice[5] = temp;
			}else if(roll[i] == 'E'){
				temp = dice[1];
				dice[1] = dice[4];
				dice[4] = dice[6];
				dice[6] = dice[3];
				dice[3] = temp;
			}else if(roll[i] == 'S'){
				temp = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[6];
				dice[6] = dice[2];
				dice[2] = temp;
			}else if(roll[i] == 'W'){
				temp = dice[1];
				dice[1] = dice[3];
				dice[3] = dice[6];
				dice[6] = dice[4];
				dice[4] = temp;
			}else if(roll[i] == 'R'){
				temp = dice[2];
				dice[2] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[4];
				dice[4] = temp;
			}else if(roll[i] == 'L'){
				temp = dice[2];
				dice[2] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[3];
				dice[3] = temp;
			}
		}
	}
	
	int Getdice(int num)
	{
		return dice[num];
	}
}

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int dicenum = scan.nextInt();
		Dice dice = new Dice();
		
		for(int i = 1;i < 7;i++)
		{
			dice.dice[i] = scan.nextInt();
		}
		boolean ansflg = false;
		for(int i = 0;i < dicenum - 1;i++)
		{
			for(int j = 1;j < 7;j++)
			{
				dice.dice2[i] = scan.nextInt();
			}
			int count;
			String str = "";
			for(int m = 0;m < 4;m++){
				for(int j = 0;j < 4;j++){
					for(int k = 0;k < 4;k++){
						count = 0;
						for(int l = 1;l < dice.dice.length;l++)
						{
							if(dice.dice[l] == dice.dice2[l])
							{
								count++;
								
							}
							if(count == 6)
							{
								ansflg = true;
							}
						}
						str = "R";
						dice.diceroll(str.toCharArray());
					}
					str = "S";
					dice.diceroll(str.toCharArray());
				}
				str = "E";
				dice.diceroll(str.toCharArray());
			}
		}
		if(ansflg == true)
		{
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}