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
		ArrsyList<Integer> clz = new ArrayList<Integer>(203);
		Scanner sc = new Scanner(System.in);
		clz.add(sc.nextInt());
		for (int i = 1; i <= 200; ++i){
			if(clz.size() >= 3 && clz.get(i - 3) == clz.get(i)){
				out.println(i);
				break;
			}
		}
	}
}
