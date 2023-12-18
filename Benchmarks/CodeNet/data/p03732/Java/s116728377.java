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
	
	
	static long max=Long.MIN_VALUE;


	public static void main(String[] args) {
		// write herea
		long N=sc.nextLong();
		long W=sc.nextLong();
		long[][] goods=new long[(int) N][2];
		for(long i=0;i<goods.length;i++){
			goods[(int) i][0]=sc.nextLong();
			goods[(int) i][1]=sc.nextLong();
		}
		
		long[][]dp=new long[(int) (W+1)][goods.length];
		for(long j=0;j<goods.length;j++){
			for(long i=0;i<W+1;i++){
				if(i<goods[(int) j][0]) {
					if(j==0)
					dp[(int) i][(int) j]=0;
					else
						dp[(int) i][(int) j]=dp[(int) i][(int) (j-1)];
				}
				else {
					if(j==0) dp[(int) i][(int) j]=goods[(int) j][1];
					else dp[(int) i][(int) j]=Math.max(dp[(int) i][(int) (j-1)], dp[(int) (i-goods[(int) j][0])][(int) (j-1)]+goods[(int) j][1]);
				}
			}
		}

		System.out.println(dp[(int) W][goods.length-1]);

		
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
					System.out.print( data[i][j]+" ");
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
				for (int j = 0; j < data.length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(double[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
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
