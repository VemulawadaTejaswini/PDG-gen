import java.util.*;
public class vowel_cnso 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		char a = in.next().charAt(0);
		
		if(a =='a' || a == 'e' || a == 'i' || a == 'o' || a=='u')
		{
			System.out.println("vowel");
		}
		
		else
		{
			System.out.println("consonant");
		}

	}

}
