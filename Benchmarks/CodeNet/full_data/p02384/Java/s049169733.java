import java.util.ArrayList;
import java.util.Scanner;

class Dice{
	int[] dice = new int[7];
	
	void Setdice(int[] box)
	{
		for(int i = 1;i< 7;i++)
		{
			dice[i] = box[i - 1];
		}
	}
	
	void diceroll(char[] roll)
	{
		for(int i = 0;i < roll.length;i++)
		{
			int[] temp = new int[7];
			if(roll[i] == 'N'){
				temp[1] = dice[1];
				temp[2] = dice[2];
				temp[5] = dice[5];
				temp[6] = dice[6];
				dice[1] = temp[2];
				dice[2] = temp[6];
				dice[5] = temp[1];
				dice[6] = temp[5];
			}else if(roll[i] == 'E'){
				temp[1] = dice[1];
				temp[3] = dice[3];
				temp[4] = dice[4];
				temp[6] = dice[6];
				dice[1] = temp[4];
				dice[3] = temp[1];
				dice[4] = temp[6];
				dice[6] = temp[3];
			}else if(roll[i] == 'S'){
				temp[1] = dice[1];
				temp[2] = dice[2];
				temp[5] = dice[5];
				temp[6] = dice[6];
				dice[1] = temp[5];
				dice[2] = temp[1];
				dice[5] = temp[6];
				dice[6] = temp[2];
			}else if(roll[i] == 'W'){
				temp[1] = dice[1];
				temp[3] = dice[3];
				temp[4] = dice[4];
				temp[6] = dice[6];
				dice[1] = temp[3];
				dice[3] = temp[6];
				dice[4] = temp[1];
				dice[6] = temp[4];
			}else if(roll[i] == 'R'){
				temp[2] = dice[2];
				temp[3] = dice[3];
				temp[4] = dice[4];
				temp[5] = dice[5];
				dice[2] = temp[3];
				dice[3] = temp[5];
				dice[4] = temp[2];
				dice[5] = temp[4];
			}else if(roll[i] == 'L'){
				temp[2] = dice[2];
				temp[3] = dice[3];
				temp[4] = dice[4];
				temp[5] = dice[5];
				dice[2] = temp[4];
				dice[3] = temp[2];
				dice[4] = temp[5];
				dice[5] = temp[3];
			}
		}
	}
	
	int Getans(int num)
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
			int top = scan.nextInt();
			int front = scan.nextInt();
			int count = 0;
			String str = "";
			
			do{
				ArrayList<Character> list = new ArrayList<Character>();
				dice.Setdice(box);
				int tmp = count;
				for(int j = 0;j < count / 7 + 1;j++)
				{	
					switch(tmp % 7)
					{
						case 0:
							list.add(' ');
							break;
						case 1:
							list.add('N');
							break;
						case 2:
							list.add('E');
							break;
						case 3:
							list.add('S');
							break;
						case 4:
							list.add('W');
							break;
						case 5:
							list.add('R');
							break;
						case 6:
							list.add('L');
							break;
						default:
							break;
					}
					if(count / 7 > 1)
					{
						tmp++;
					}
				}
				count++;
				str = list.toString();
				dice.diceroll(str.toCharArray());
				
			}while(top != dice.Getans(1) || front != dice.Getans(2));

			System.out.println(dice.Getans(3));
		}
	}
}