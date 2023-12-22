import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.xml.crypto.Data;
public class Main{
	static int INF = 2 << 28;
	static int[] vxL = {0,0,1,-1};
	static int[] vxR = {0,0,-1,1};
	static int[] vyL = {1,-1,0,0};
	static int[] vyR = {1,-1,0,0};
	static int w;
	static int h;
	static int Lx;
	static int Ly;
	static int Rx;
	static int Ry;
	static char[][] mapL;
	static char[][] mapR;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			ArrayList<String> type    = new ArrayList<String>();
			ArrayList<String> a1 = new ArrayList<String>();
			ArrayList<String> a2 = new ArrayList<String>();
			for(int i = 0; i < n; i++) {
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();
				type.add(a);
				a1.add(b.replaceAll("\\?", "."));
				a2.add(c.replaceAll("\\?", "."));
			}
			ArrayList<String> list = new ArrayList<String>();
			for(int i = 0; i < m; i++) {
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();
				boolean bad = true;
				for(int j = type.size()-1; j >= 0; j--) {
					if(a.matches(a1.get(j)) && b.matches(a2.get(j))) {
						if(type.get(j).equals("deny")) {
							bad = true;
							break;
						}
						else {
							bad = false;
							break;
						}
					}
				}
				if(!bad)
				list.add((a + " " + b + " " + c));
			}
			System.out.println(list.size());
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
}