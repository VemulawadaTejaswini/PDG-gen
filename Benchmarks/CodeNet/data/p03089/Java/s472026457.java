import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ni();
		ns();
		int[] b = ni(a);

		Stack<Integer> s = new Stack<Integer>();
		List<Integer> l = new ArrayList<Integer>();
		for (int i : b) {
			l.add(i);
		}
		if (solve(s, l)) {
			while(!s.isEmpty())
				out(s.pop());
		} else {
			System.out.println(-1);
		}

	}

	private static boolean solve(Stack<Integer> s, List<Integer> l) {
		// TODO Auto-generated method stub
		while (l.size() > 0) {
			
			int i = 0;
			boolean tag=true;
			for (i = l.size()-1; i >=0; i--) {
				int k = l.get(i);
				if(i+1==k) {
					s.add(k);
					break;
				}
			}
			if(i==-1) {
				return false;
			}else {
				l.remove(i);
			}
		}
		return true;
	}

	private static void out(List<Integer> l) {
		// TODO Auto-generated method stub
		for (int i : l)
			System.out.println(i);

	}

	private static void out(int[] b) {
		// TODO Auto-generated method stub
		for (int i : b)
			System.out.println(i);

	}

	public static void out(String str) {

		if (dbg)
			System.out.println(str);
	}

	public static void out(int str) {

		if (dbg)
			System.out.println(str);
	}

	public static int ni() {

		return sc.nextInt();

	}

	public static String ns() {

		return sc.nextLine();
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();
		sc.nextLine();
		return res;
	}

	public static String[] ns(int k) {
		String[] res = new String[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextLine();
		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
		sc.nextLine();
		return res;
	}
}
