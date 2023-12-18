import java.io.*;
import java.util.*;

public class Exp { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = str.indexOf('A');
		String ans = "";
		for (int i = index; i < str.length(); i++ )
		{
			if(str.charAt(i)=='Z')
			{
				System.out.print(str.charAt(i));
				break;
			}
			else
				System.out.print(str.charAt(i));

		}
		

	}
}