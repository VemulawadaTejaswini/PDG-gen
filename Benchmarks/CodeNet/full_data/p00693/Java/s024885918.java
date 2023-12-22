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
			ArrayList<String> permit1 = new ArrayList<String>();
			ArrayList<String> permit2 = new ArrayList<String>();
			ArrayList<String> deny1 = new ArrayList<String>();
			ArrayList<String> deny2 = new ArrayList<String>();
			for(int i = 0; i < n; i++) {
				String a = sc.next();
				if(a.equals("permit")) {
					permit1.add(sc.next().replaceAll("\\?", "."));
					permit2.add(sc.next().replaceAll("\\?", "."));
				}
				else {
					deny1.add(sc.next().replaceAll("\\?", "."));
					deny2.add(sc.next().replaceAll("\\?", "."));
				}
			}
			ArrayList<String> list = new ArrayList<String>();
			for(int i = 0; i < m; i++) {
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();
				boolean bad = false;
				for(int j = 0; j < deny1.size(); j++) {
					if(a.matches(deny1.get(j)) && b.matches(deny2.get(j))) bad = true;
				}
				if(bad) continue;
				bad = true;
				for(int j = 0; j < permit1.size(); j++) {
					if(a.matches(permit1.get(j)) && b.matches(permit2.get(j))) bad = false;
				}
				if(bad) continue;
				list.add((a + " " + b + " " + c));
			}
			System.out.println(list.size());
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
}