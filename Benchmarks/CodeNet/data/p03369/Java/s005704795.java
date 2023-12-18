import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			int total = 700;
			if(str.charAt(0) == 'o')
				total += 100;
			if(str.charAt(1) == 'o')
				total += 100;
			if(str.charAt(2) == 'o')
				total += 100;
		    System.out.println(total);
	}
    
}