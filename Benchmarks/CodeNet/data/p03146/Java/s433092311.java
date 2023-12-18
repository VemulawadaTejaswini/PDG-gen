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
	  int tmp;
		ArrayList<Integer> clz = new ArrayList<Integer>(203);
		Scanner sc = new Scanner(System.in);
		clz.add(sc.nextInt());
      
		for (int i = 1; i <= 200; ++i){
		  tmp = clz.get(i - 1);
		  if(tmp % 2 == 0) clz.add(tmp / 2);
		  else clz.add(3 * tmp + 1);
		  
			if(clz.size() >= 4){
			  if(clz.get(i - 3) == clz.get(i)){
  				out.println(i + 1);
  				break;
			  }
			}
		}
	}
}
