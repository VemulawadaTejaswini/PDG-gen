import java.util.*;

public class Main {

	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		int y = 700;
		for(int i = 0; i < 3; i++)
		{
			if(S == "o") 
			{
				count ++;
			}
			else if(S == "x")
			{
				
			}
		}
		y = y + (100 * count);
		System.out.println(y);
	}

}