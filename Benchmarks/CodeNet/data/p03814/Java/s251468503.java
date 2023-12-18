import java.util.*;
import java.io.*;

public class Main {

	// A to Z String -- Snuke has decided to....
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String test = in.nextLine();
		int indexA = 0;
		int indexZ = 0;
		
		for(int i = 0; i < test.length(); i++)
		{
			if(test.charAt(i)=='A')
				indexA = i;
			if(test.charAt(i)=='Z')
				indexZ = i;
		}
		if(indexZ != test.length()-1)
		{
			String res = test.substring(indexA, indexZ+1);
			int len = res.length();
			System.out.println(len);
		}
		else
		{
			String res2 = test.substring(indexA);
			int len2 = res2.length();
			System.out.println(len2);
		}
			
		
		
	}

}