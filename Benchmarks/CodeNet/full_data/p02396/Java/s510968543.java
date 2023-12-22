import java.util.*;
import java.io.*;

class Main {
	public static void main(String argv[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int i;
		i = 0;
		
		String str;
		str = null;
		
		do{
			str = scan.next();
			i++;
			System.out.println("Case " + Integer.toString(i) + ": " + str);
		}while(Integer.parseInt(str) != 0);
	}
}