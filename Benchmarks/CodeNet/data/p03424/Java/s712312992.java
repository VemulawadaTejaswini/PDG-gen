import java.util.*;
import java.io.*;
import java.text.*;
import java.lang.*;
import java.math.*;

public class Solution {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

			int n = in.nextInt();
		        List<Character> arr = new ArrayList<Character>();
			in.nextLine();
			String str = in.nextLine();
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != ' ')
					arr.add(str.charAt(i));
			}

			if(arr.contains('P') && arr.contains('W') && arr.contains('G') && arr.contains('Y'))
				System.out.println("Four");
			else
				System.out.println("Three");
	}
    
}