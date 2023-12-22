import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String ans = "";
		String x = input.next();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i)=='?') ans+="D";
			else ans+=x.substring(i,i+1);
		}
		System.out.println(ans);
	}	
}