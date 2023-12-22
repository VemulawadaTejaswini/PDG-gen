import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		Dice dice = new Dice();
		for(int i=0;i<strs.length;i++)
		{
			dice.setNum(i,Integer.parseInt(strs[i]));
		}
		String instruction = br.readLine();
		dice.rotation(instruction);
		dice.printTop();
		// TODO 自動生成されたメソッド・スタブ

	}
}

class Dice
{
	int[] num;
	
	public Dice()
	{
		num = new int[6];
	}
	
	public void setNum(int index,int Num)
	{
		num[index] = Num;
	}
	
	public void printTop()
	{
		System.out.println(num[0]);
	}
	
	public void rotateS()
	{
		int temp = num[0];
		num[0] = num[4];
		num[4] = num[5];
		num[5] = num[1];
		num[1] = temp;
	}
	
	public void rotateN()
	{
		int temp = num[4];
		num[4] = num[0];
		num[0] = num[1];
		num[1] = num[5];
		num[5] = temp;
	}
	
	public void rotateW()
	{
		int temp = num[0];
		num[0] = num[2];
		num[2] = num[5];
		num[5] = num[3];
		num[3] = temp;
	}
	
	public void rotateE()
	{
		int temp = num[0];
		num[0] = num[3];
		num[3] = num[5];
		num[5] = num[2];
		num[2] = temp;
	}
	
	public void rotation(String instruction)
	{
		for(int i=0;i<instruction.length();i++)
		{
			switch(instruction.charAt(i))
			{
			case 'S':
				rotateS();
				break;
			case 'N':
				rotateN();
				break;
			case 'W':
				rotateW();
				break;
			case 'E':
				rotateE();
				break;
				
				default :
					break;
			}
		}
	}
}