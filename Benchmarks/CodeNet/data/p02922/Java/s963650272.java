/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/
*/

import java.util.*;
import java.util.Collections; // sorting use
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int a,b;
		int tap = 1;
		int ans = 0;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		while(tap < b){
			tap += (a - 1);
			++ans;
		}
		out.println(ans);
	}
}
