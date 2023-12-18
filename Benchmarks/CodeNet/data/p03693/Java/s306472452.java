import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num = Integer.parseInt(in.nextLine());
		
		if(num % 4 == 0) {
			System.out.println("YES");
			System.out.println(num + " is a multiple of 4, and thus YES should be printed");
		}
		else {
			System.out.println(num + " is not a multiple of 4, and thus NO should be printed");
		}
			
		
		

	}

}