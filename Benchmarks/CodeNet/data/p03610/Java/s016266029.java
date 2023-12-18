import java.io.*;
import java.math.*;
import java.util.*;
public class Main{ 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String S = input.next();
		String ans = "";
		for (int i = 0; i < S.length(); i+=2) {
			ans+=S.substring(i,i+1);
		}
		System.out.println(ans);
	}
}