import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		boolean flag = count%2==0?false:true;
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < count; i++)
		{
			if(flag)
			{
				s.append(input.nextInt());
				s.append(" ");
				flag = !flag;
			} else {
				s.insert(0, input.nextInt()+" ");				
				flag = !flag;
			}
		}
			
		if(flag)
		{
			System.out.println(s);
		}
		else
		{
			s.deleteCharAt(s.length()-1);
			s.reverse();
			System.out.println(s);
		}

	}

}