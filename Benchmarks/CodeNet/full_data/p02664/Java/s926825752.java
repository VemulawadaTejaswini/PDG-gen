import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String x = input.next();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i)=='?') System.out.print("D");
			else System.out.print(x.substring(i,i+1));
		}
	}	
}