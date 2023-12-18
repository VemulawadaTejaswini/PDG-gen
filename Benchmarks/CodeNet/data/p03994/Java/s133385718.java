
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

import jdk.internal.dynalink.beans.StaticClass;

public class Main {

	static final int INF=Integer.MAX_VALUE;			// 2147483647
	static final long LINF=Long.MAX_VALUE;			// 9223372036854775807

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		int k = sc.nextInt();
		long k = sc.nextLong();
		sc.close();
		String[] Strs = str.split("", 0);
		int n = Strs.length;
		int[] Ints = new int[n];
		for (int i = 0; i<n; i++) {
			Ints[i] = Alph2Num.get(Strs[i]);
		}
//		pa(Strs);
//		pa(Ints);
		
		for (int i = 0; i<n; i++) {
			int delta = 26 - Ints[i];
//			p(delta);
			if (delta <= k) {
				k -= delta;
				Ints[i] = 0;
			}
		}
		// Kの端数は最後に押し付け
		if (k > 0) {
			Ints[n-1] = (int)((Ints[n-1] + (k % 26)) % 26);
		}

		for (int i = 0; i<n; i++) {
			pn(Num2Alph.get(Ints[i]));
		}
		p("");
	}
	
	
	
	
	public static void p(Number a) {
		System.out.println(a);		
	}
	public static void p(String a) {
		System.out.println(a);		
	}
	public static void pn(Number a) {
		System.out.print(a);		
	}
	public static void pn(String a) {
		System.out.print(a);		
	}
	public static void pa(String[] As) {
		for (int i = 0; i<As.length; i++) {
			pn(As[i]);
			pn(", ");
		}
		p("");
	}
	public static void pa(Number[] As) {
		for (int i = 0; i<As.length; i++) {
			pn(As[i]);
			pn(", ");
		}
		p("");
	}
	public static void pa(int[] As) {
		for (int i = 0; i<As.length; i++) {
			pn(As[i]);
			pn(", ");
		}
		p("");
	}

	public static int powerInt(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public static int max(int arr[]) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static double max(double arr[]) {
		double max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}	
	public static int min(int arr[]) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static double min(double arr[]) {
		double max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}

	static Map<String, Integer> Alph2Num = new HashMap<String, Integer>() {
		{
			put("a", 0);
			put("b", 1);
			put("c", 2);
			put("d", 3);
			put("e", 4);
			put("f", 5);
			put("g", 6);
			put("h", 7);
			put("i", 8);
			put("j", 9);
			put("k", 10);
			put("l", 11);
			put("m", 12);
			put("n", 13);
			put("o", 14);
			put("p", 15);
			put("q", 16);
			put("r", 17);
			put("s", 18);
			put("t", 19);
			put("u", 20);
			put("v", 21);
			put("w", 22);
			put("x", 23);
			put("y", 24);
			put("z", 25);
		}
	};


	static Map<Integer, String> Num2Alph = new HashMap<Integer, String>() {
		{
			put(0, "a");
			put(1, "b");
			put(2, "c");
			put(3, "d");
			put(4, "e");
			put(5, "f");
			put(6, "g");
			put(7, "h");
			put(8, "i");
			put(9, "j");
			put(10, "k");
			put(11, "l");
			put(12, "m");
			put(13, "n");
			put(14, "o");
			put(15, "p");
			put(16, "q");
			put(17, "r");
			put(18, "s");
			put(19, "t");
			put(20, "u");
			put(21, "v");
			put(22, "w");
			put(23, "x");
			put(24, "y");
			put(25, "z");
		}
	};

}
