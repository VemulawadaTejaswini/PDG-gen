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
		int n;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		n = sc.nextInt();
		a = new ArrayList<Integer>();
		b = new ArrayList<Integer>();

		for(int i = 0; i < n; ++i){
			a.add(sc.nextInt());
			b.add(a.get(i));
		}
		Collections.sort(b);
		Collections.reverse(b);
		for(int i = 0; i < n; ++i){
			if(a.get(i) == b.get(0)){
				out.println(b.get(1));
			}
			else{
				out.println(b.get(0));
			}
		}
	}
}
