import java.util.*;

//Circle in a Rectangle
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int [] x = new int[10000]; 
		while(true)
		{
			String input = sc.nextLine();
			x[i] = Integer.parseInt(input);
			if(x[i] == 0) break;
		}
		for(i=0;i<10000;i++)
		{
			if(x[i] == 0) break;
			System.out.println("Case "+i+": "+ x);
		}
		sc.close();
	}
}
