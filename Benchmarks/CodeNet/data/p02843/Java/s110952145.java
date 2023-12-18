/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/

	coding: utf-8
	lang: Java8 (OpenJDK 1.8.0)
*/

import java.util.*;
import java.util.Collections; // sorting use
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int x;
		int n,sum;
		ArrayList<Integer> plist = 
			new ArrayList<Integer>(Arrays.asList(100, 101, 102, 103, 104, 105));
		ArrayList<Integer> pat = new ArrayList<Integer>();
		Scanner sc = new Scanner(in);

		for (int i = 0; i < (1 << 6); ++i){
			sum = 0;
			n = i;
			for (int j = 5; j >= 0; j--){
				sum += (plist.get(j) * (n & 1));
				n = n >> 1;
			}
			pat.add(sum);
		}
		Collections.sort(pat);
		x = sc.nextInt() % Collections.max(pat);

		for (int i = 0; i < pat.size(); ++i){
			if(x == pat.get(i)){
				out.println("1");
				exit(0);
			}
		}
		out.println("0");
		exit(0);
	}
}
