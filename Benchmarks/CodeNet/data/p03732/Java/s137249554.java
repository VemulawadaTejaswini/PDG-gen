import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static boolean debug = true;
	static Scanner sc = new Scanner(System.in);

	static long max = Long.MIN_VALUE;

	public static void main(String[] args) throws Exception {

		int N = 0, W = 0;
		int[][] goods = new int[1][1];
		N = sc.nextInt();
		W = sc.nextInt();
		int min=Integer.MAX_VALUE;
		goods = new int[N][2];
		for (int i = 0; i < goods.length; i++) {
			goods[i][0] = sc.nextInt();
			goods[i][1] = sc.nextInt();
			min=Math.min(min, goods[i][0]);
		}
		min--;
		int[][] dp = new int[1][1];
		int gap=W-min;

		dp = new int[gap][goods.length];
		for (int ii = 0; ii < gap ; ii++) {
			for (int j = 0; j < goods.length; j++) {
				int i=ii+min;
				if (i < goods[j][0]) {
					if (j == 0)
						dp[ii][j] = 0;
					else
						dp[ii][j] = dp[ii][j - 1];
				} else {
					if (j == 0)
						dp[ii][j] = goods[j][1];
					else
						dp[ii][j] = Math.max(dp[ii][j - 1], dp[i - goods[j][0]][j - 1] + goods[j][1]);
				}
			}
		}
	
		System.out.println(dp[gap-1][goods.length - 1]);

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