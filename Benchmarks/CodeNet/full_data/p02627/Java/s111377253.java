import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
			char[] c = reader.readLine().toCharArray();
			if(Character.isLowerCase(c[0])) System.out.println("a");
			else System.out.println("A");		
	}
}
