import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static boolean debug = true;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] k=new int[N];
		for(int i=0;i<M;i++){
			int s=sc.nextInt();int f=sc.nextInt();
			k[s-1]++;k[f-1]++;
		}
		String res="YES";
		for(int i=0;i<N;i++){
			if((k[i]&1)==1) {
				res="NO";
				break;
			}
		}
		System.out.println(res);
		
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
				for (int j = 0; j < data.length; j++) {
					System.out.print(i+" "+j + ":" + data[i]);
				}
				System.out.println();
			}
		}
	}
	private static void print(char[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data.length; j++) {
					System.out.print(i+" "+j + ":" + data[i]);
				}
				System.out.println();
			}
		}
	}
	private static void print(String[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data.length; j++) {
					System.out.print(i+" "+j + ":" + data[i]);
				}
				System.out.println();
			}
		}
	}
	private static void print(double[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data.length; j++) {
					System.out.print(i+" "+j + ":" + data[i]);
				}
				System.out.println();
			}
		}
	}
}
