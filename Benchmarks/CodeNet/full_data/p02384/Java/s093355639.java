import java.util.Scanner;

class Dice{
	int[] dice = new int[7];
	
	void Setdice(int[] box)
	{
		dice[0] = 0;
		for(int i = 1;i< 7;i++)
		{
			dice[i] = box[i - 1];
		}
	}
	
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
		Dice dice = new Dice();
		int[] box = new int[6];
		for(int i = 0;i < 6;i++)
		{
			box[i] = scan.nextInt();
		}
		int questions = scan.nextInt();
		
		for(int i = 0;i < questions;i++)
		{
			dice.Setdice(box);
			int top = scan.nextInt();
			int front = scan.nextInt();
			String str = "";
			
			for(int j = 1;j < 7;j++)
			{
				if(top == dice.Getdice(j))
				{
					switch(j)
					{
						case 1:
							break;
						case 2:
							str = "N";
							break;
						case 3:
							str = "W";
							break;
						case 4:
							str = "E";
							break;
						case 5:
							str = "S";
							break;
						case 6:
							str = "SS";
							break;
						default:
							break;
					}
				}
			}
			dice.diceroll(str.toCharArray());
			
			for(int j = 2;j < 6;j++)
			{
				if(front == dice.Getdice(j))
				{
					switch(j)
					{
						case 2:
							System.out.println(dice.Getdice(3));
							break;
						case 3:
							System.out.println(dice.Getdice(5));
							break;
						case 4:
							System.out.println(dice.Getdice(2));
							break;
						case 5:
							System.out.println(dice.Getdice(4));
							break;
						default:
							break;
					}
				}
			}
		}
	}
}