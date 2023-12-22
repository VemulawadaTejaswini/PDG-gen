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
		String[] first = br.readLine().split(" ");
		String[] second = br.readLine().split(" ");
		Dice dice1= new Dice();
		Dice dice2 = new Dice();
		
		for(int i=0;i<first.length;i++)
		{
			dice1.setNum(i,Integer.parseInt(first[i]));
			dice2.setNum(i,Integer.parseInt(second[i]));
		}
		
		System.out.println(dice1.equals(dice2) ? "Yes":"No");
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
	
	@Override
	public boolean equals(Object o)
	{
		Dice d = (Dice)o;
		d.getTopFront(this.num[0], this.num[1]);
		int c = 0;
		for(int i=2;i<num.length;i++)
		{
			if(this.num[i] == d.num[i])c++;
		}
		if(c == num.length-2)return true;
		return false;
	}
	
	public void getTopFront(int top,int front)
	{
		int i=0;
		while(true)
		{
			rotateN();
			if(front == num[1])
			{
				break;
			}
			
			if(i%2==0)
			{
				rotateE();
			}else
			{
				rotateW();
			}
			if(front==num[1])
			{
				break;
			}
			i++;
		}
		
		while(true)
		{
			rotateW();
			if(top == num[0])
			{
				break;
			}
		}
	}
	
	public void setNum(int index,int Num)
	{
		num[index] = Num;
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
		int temp = num[0];
		num[0] = num[1];
		num[1] = num[5];
		num[5] = num[4];
		num[4] = temp;
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