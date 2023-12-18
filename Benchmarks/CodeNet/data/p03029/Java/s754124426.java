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

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//setOut();
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println((a*3+b)/2);
	

		
	}






	private static String solve(int[] a, int[] b) {
		// TODO Auto-generated method stub
		Arrays.sort(b);
	
		int sum=0;
		for(int i=0;i<a[1];i++) {
			sum+=b[a[1]-1]-b[i];
		}
		int min=sum;
		min=Math.min(min, sum);
	
		int j=0;
		for(int i=a[1];i<a[0];i++) {
	
			sum=sum-(b[i-1]-b[j])+(b[i]-b[i-1])*(a[1]-1);
			++j;
			
			min=Math.min(min, sum);
		}
		return ""+min;
		
	}






	private static void setOut() throws FileNotFoundException {
		sc = new Scanner(new FileInputStream("in.txt"));
		System.setOut(new PrintStream(new FileOutputStream("out.txt")));
		
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
