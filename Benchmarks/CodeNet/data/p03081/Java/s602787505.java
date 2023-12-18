package atc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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

public class Solution {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;
	static List<int[]> l = new ArrayList();

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// setOut();

		int a=ni();
		int b=ni();
		ns();
		String str=ns();
		String[] step=ns(b);



		System.out.println(solve(a,b,str,step));
		

	}




	private static int solve(int a, int b, String str, String[] step) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack();
		char target=str.charAt(0);
		int pos=0;
		int max=0;
		int count=0;
		for(int i=step.length-1;i>=0;i--) {
			String st=step[i];
			if( st.charAt(2)=='L'&&st.charAt(0)==target) {
				s.add(target);
				pos++;
				count++;
				target=str.charAt(pos);
				max=Math.max(max, count);
			}
			if(st.charAt(2)=='R' && !s.empty()&&st.charAt(0)==s.peek()) {
				pos--;
				count--;
				target=s.pop();
			}
		}
		
		pos=str.length()-1;
		target=str.charAt(pos);
		int max2=0;
		s=new Stack();
		count=0;
		for(int i=step.length-1;i>=0;i--) {
			String st=step[i];
			if( st.charAt(2)=='R'&&st.charAt(0)==target) {
				s.add(target);
				pos--;
				count++;

				target=str.charAt(pos);
				max2=Math.max(max2, count);
			}
			if(st.charAt(2)=='L' && !s.empty()&&st.charAt(0)==s.peek()) {
				pos++;
				count--;
				target=s.pop();
			}
		}


		int k=str.length()-max-max2;
		
		return k<0?0:k;
		
		
		
		
		
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
