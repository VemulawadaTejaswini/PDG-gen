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
		Dice3 dice1= new Dice3();
		Dice3 dice2 = new Dice3();
		
		for(int i=0;i<first.length;i++)
		{
			dice1.setNum(i,Integer.parseInt(first[i]));
			dice2.setNum(i,Integer.parseInt(second[i]));
		}
		
		System.out.println(dice1.equals(dice2) ? "Yes":"No");
		// TODO 自動生成されたメソッド・スタブ

	}
}

class Dice3
{
	int[] num;
	
	public Dice3()
	{
		num = new int[6];
	}
	public boolean isSame(Dice3 d)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i] != d.num[i])return false;
		}
		
		return true;
	}
	@Override
	public boolean equals(Object o)
	{
		Dice3 D = (Dice3)o;
		
		for(int i=0;i<4;i++)
		{
			if(isSame(D))return true;
			rotateS();
			
			if(isSame(D))return true;
			
			for(int j=0;j<4;j++)
			{
				rotateE();
				if(isSame(D))return true;
			}
		}
		rotateW();
		
		for(int i=0;i<4;i++)
		{
			if(isSame(D))return true;
			rotateS();
			if(isSame(D))return true;
			for(int j=0;j<4;j++)
			{
				rotateE();
				if(isSame(D))return true;
			}
			
		}
		
		return false;
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
}