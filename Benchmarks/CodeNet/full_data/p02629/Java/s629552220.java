import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		while(true){
			ans += (char)(96 + (n%26));
			if(n<26) break;
			n = n/26;
		}
		for(int i=ans.length()-1 ; i>=0; i--){
			System.out.print(ans.charAt(i));
		}
		
	}

}