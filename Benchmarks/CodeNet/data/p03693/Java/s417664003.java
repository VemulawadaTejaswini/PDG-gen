import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		while(in.hasNextLine())
		{
			int[]arr = new int[3];
			String empty = "";
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = in.nextInt();
				empty += arr[i];
			}
			
			int num = Integer.parseInt(empty);
			
			if(num % 4 == 0) {
				System.out.println("YES");
				//System.out.println(num + " is a multiple of 4, and thus YES should be printed.");
			}
			else {
				System.out.println("NO");
				//System.out.println(num + " is not a multiple of 4, and thus NO should be printed.");
			}
				
		}
		
		
		

	}

}
