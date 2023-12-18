
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// setOut();

		int a = ni();
		int b = ni();
		int c = ni();
		int d = ni();
		long[] ar = nl(a);
		long[] br = nl(b);
		long[] cr = nl(c);

		TreeMap<Long,Integer> res = (solve(d, ar, br, cr));
		while(d!=0) {
	
			d--;
			long max=res.lastKey();
			if(res.get(max)!=0) {
				System.out.println(max);
				res.put(max, res.get(max)-1);
				if(res.get(max)==0)
					res.remove(max);
			}
		}

	}

	private static long[] nl(int c) {
		long[] res = new long[c];
		for (int i = 0; i < c; i++)
			res[i] = sc.nextLong();

		return res;
	}

	private static TreeMap<Long,Integer> solve(int d, long[] ar, long[] br, long[] cr) {
		// TODO Auto-generated method stub

		TreeMap<Long,Integer> s = new TreeMap<Long,Integer>();

		for (long a : ar) {
			for (long b : br) {
				for (long c : cr) {
					long max = a + b + c;
					if (s.size() < d+1) {
						if(s.containsKey(max)) {
							s.put(max, s.get(max)+1);
						}else {
							s.put(max, 1);
						}
						
					} else {
						long k = s.firstKey();

						if(max==k) {
							s.put(max,s.get(max)+1);
						}else {
							if(s.containsKey(max)) {
								s.put(max, s.get(max)+1);
							}else {
								s.remove(k);
								s.put(max, 1);
							}
						}
						
					}
				}
			}
		}
		
		return s;
	}

	private static void out(long[] cr) {
		// TODO Auto-generated method stub
		for(long l:cr)
			System.out.print(l+" ");
		System.out.println();
		
	}

	private static void out(int[][] dist2) {
		// TODO Auto-generated method stub
		for (int[] i : dist2) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			out("");
		}

	}

	private static void setOut() throws FileNotFoundException {
		sc = new Scanner(new FileInputStream("in.txt"));
		System.setOut(new PrintStream(new FileOutputStream("out.txt")));

	}

	private static void out(char[][] b) {
		// TODO Auto-generated method stub
		for (char[] c : b) {
			out(c);
		}

	}

	private static void out(char[] c) {
		// TODO Auto-generated method stub
		for (char cc : c)
			System.out.print(cc + " ");
		System.out.println();
	}

	private static void out(int[] b) {
		// TODO Auto-generated method stub
		for (int i : b)
			System.out.print(i + " ");
		System.out.println();

	}

	public static void out(String str) {

		System.out.println(str);
	}

	public static void out(int str) {

		System.out.println(str);
	}

	public static int ni() {

		return sc.nextInt();

	}

	public static String ns() {

		return sc.next();
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();

		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
		sc.next();
		return res;
	}
}
