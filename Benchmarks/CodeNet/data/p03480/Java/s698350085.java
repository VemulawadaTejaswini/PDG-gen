/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;

/*
	01010
 */
public class Main
{
	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		//int ans = Math.min(solve(s), solve(reverse(s)));
		//
		
		char[] arr = s.toCharArray();
		int cnt0 = 0;
		int cnt1 = 0;
		for(char c : arr) {
			if(c == '0')
				++cnt0;
			else 
				++cnt1;
		}
		System.out.println(Math.max(solve(arr), solve(reverse(s).toCharArray())));
 	}


 	private static int solve(char[] arr) {
 		
 		int mod = 0;
 		int cnt0 = arr[0] == '0' ? 1 : 0;
 		int cnt1 = arr[0] == '1' ? 1 : 0;
 		int ans = Integer.MAX_VALUE;
 		for(int i = 1; i < arr.length; ++i) {
 			if(arr[i] != arr[i - 1]) {
 				++mod;
 				if(mod >= 2) {
 					ans = Math.min(ans, cnt0 + cnt1);
 					if(arr[i] == '0')
 						cnt0 = 1;
 					else 
 						cnt1 = 1;
 				} else {
 					if(arr[i] == '0')
 						++cnt0;
 					else 
 						++cnt1;
 				}
 			} else {
 				if(arr[i] == '0')
 					++cnt0;
 				else 
 					++cnt1;
 			}
 		}

 		if(mod >= 2) {
 			return ans;
 		}

 		cnt0 = cnt1 = 0;

 		for(char c : arr) {
 			if(c == '0')
 				++cnt0;
 			else 
 				++cnt1;
 		}

 		return Math.max(cnt0, cnt1);

 	}


 	private static String reverse(String s) {
 		StringBuilder ret = new StringBuilder();
 		char[] arr = s.toCharArray();

 		for(char c : arr) {
 			if(c == '0')
 				ret.append('1');
 			else 
 				ret.append('0');
 		}

 		return ret.toString();
 	}

}