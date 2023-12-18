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
	static int[][] map;

	public static void main(String[] args) {
		// write herea
		int N=sc.nextInt();
		int M=sc.nextInt();
		map=new int[N][N];

		for(int i=0;i<M;i++){
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			int value=sc.nextInt();
			map[x][y]=value;

		}
		Set<Integer> s= new HashSet();
		
		s.add(0);
		helper(0,s,0);
		System.out.println(max);
		
	}

	private static void helper(long value, Set<Integer> s, int vertex) {
		// TODO Auto-generated method stub
		for(int i=0;i<map.length;i++){
			if(map[vertex][i]!=0){
				if(s.contains(i)) {
					if(check(i,new HashSet<Integer>(i),0)>0){
						System.out.println("inf");
					System.exit(0);
					}else{
						for(int i1=0;i1<map.length;i1++){
							map[i1][i]=0;
						}
					}
					
				}
				else{
					value+=map[vertex][i];
					s.add(i);
					if(i==map.length-1) max=Math.max(value, max);
					helper(value,s,i);
					value-=map[vertex][i];
					s.remove(i);
				}
			}
		}
		
	}





	private static int check(int pos, HashSet<Integer> hashSet,int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<map.length;i++){
			if(map[pos][i]!=0){
				sum+=map[pos][i];
				if(hashSet.contains(pos)) return sum;
				hashSet.add(i);
				check(i,hashSet,sum);
				hashSet.remove(i);
				sum-=map[pos][i];
			}
		}
		return 0;
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
					System.out.print(i + " " + j + ":" + data[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	private static void print(char[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data.length; j++) {
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
