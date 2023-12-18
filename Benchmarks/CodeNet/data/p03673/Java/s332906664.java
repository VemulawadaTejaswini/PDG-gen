import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		boolean flag = count%2==0?false:true;
		for(int i = 0; i < count; i++)
		{
			if(flag)
			{
				list.addLast(input.nextInt());
				flag = !flag;
			} else {
				list.addFirst(input.nextInt());
				flag = !flag;
			}
		}
		for(int i=0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}

}