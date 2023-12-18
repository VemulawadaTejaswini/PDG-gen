import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		boolean flag = count%2==0?false:true;
		for(int i = 0; i < count; i++)
		{
			if(flag)
			{
				list.add(input.nextInt());
				flag = !flag;
			} else {
				list.add(0,input.nextInt());
				flag = !flag;
			}
		}
		if(flag)
		{
			for(int i=0; i < list.size(); i++)
			{
				System.out.print(list.get(i)+" ");
			}
		}
		else
		{
			for(int i=list.size()-1; i >= 0; i--)
			{
				System.out.print(list.get(i)+" ");
			}
		}
	}

}
