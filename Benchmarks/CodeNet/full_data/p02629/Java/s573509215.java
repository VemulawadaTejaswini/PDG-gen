import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(n);
		String ans = "";
		n--;
		while(n>=0){
			ans += (char)(97 + (n%26));
			n = n/26;
			n--;
		}
		for(int i=ans.length()-1 ; i>=0; i--){
			System.out.print(ans.charAt(i));
		}
		
	}

}