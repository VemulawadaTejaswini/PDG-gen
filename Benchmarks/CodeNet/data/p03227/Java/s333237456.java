
import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String word=input.nextLine();
		
		StringBuilder sb=new StringBuilder(word);
		if(word.length()==2)
			System.out.println(word);
		else
			System.out.println(sb.reverse());
	
	}
	


}

