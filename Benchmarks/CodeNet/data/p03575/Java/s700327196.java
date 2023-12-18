import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Usr {
	int count = 0;
	Map<Integer, String> m = new HashMap<Integer, String>();
	Set<String> name = new HashSet<String>();
	Set<String> mail = new HashSet<String>();
}

public class Main {
	static boolean debug = true;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Map<Integer,Set<Integer>> m=new HashMap();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] vert = new int[a + 1];
		for (int i = 0; i < b ; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			Set<Integer> s1=m.getOrDefault(x, new HashSet<Integer>());
			Set<Integer> s2=m.getOrDefault(y, new HashSet<Integer>());
			s1.add(y);
			s2.add(x);
			m.put(x, s1);
			m.put(y,s2);
			vert[x]++;
			vert[y]++;
		}
		int count=0;
		while(true){
			boolean tag=true;
			for(int i=1;i<a+1;i++){
				if(vert[i]==1){
		
					Set<Integer> s=m.get(i);
					
					Iterator<Integer> ite = s.iterator();
					int value=ite.next();
					m.remove(i);
					s=m.get(value);
					s.remove(i);
					vert[i]--;
					vert[value]--;
					count++;
					tag=false;
				}
			}
			if(tag) break;
		}
		System.out.println(count);
	}

	private static int helper(int h, int w, int a, int b) {
		// TODO Auto-generated method stub
		long total = h * w;
		int forbid = a * b;
		long size = (total - forbid) - h - w + 1;
		if (size <= 0)
			return 1;
		int res = 1;
		for (int i = 0; i < size; i++) {
			res = (res * 2) % 1000000007;
		}
		return res;
	}

	private static int helper(int[] arr) {
		// TODO Auto-generated method stub
		int res = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] == i && arr[i + 1] == (i + 1)) {
				int tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
				++i;
				++res;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == i) {
				++res;
			}
		}
		return res;
	}

	private static void print(String string) {
		// TODO Auto-generated method stub
		if (debug)
			System.out.println(string);
	}

	private static void print(int[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(String[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(char[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(double[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(long[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(int[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(long[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(char[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(String[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(double[][] data) {

		if (debug) {
			for (int i = 0; i < data[0].length; i++) {
				for (int j = 0; j < data.length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void inPutData(char[][] c) {
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextLine().toCharArray();
		}
	}

}