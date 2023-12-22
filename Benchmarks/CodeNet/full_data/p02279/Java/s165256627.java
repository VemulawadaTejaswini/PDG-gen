import java.io.*;
import java.util.*;

public class Main{
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] node = new int[n];
		int[] k = new int[n];
		int[] parent = new int[n];
		int[] depth = new int[n];
		StringBuilder[] c = new StringBuilder[n];
		int leafint = 0;


		for (int i =0; i<n ; i++ ) {
			c[i] = new StringBuilder();
		}

		String[] line = new String[n];

		for (int i = 0; i<n ;  i++) {
			line[i] = br.readLine();
			int index = line[i].indexOf(" ");
			node[i] = Integer.parseInt(line[i].substring(0,index));
		}
		for (int i = 0; i<n ; i++ ) {
			String[] str = line[i].split(" ");
			k[i] = Integer.parseInt(str[1]);
			if (k[i] == 0) {
				continue;
			}else{
				for (int j = 2; j< (k[i]+2) ; j++ ) {
					int stack = Integer.parseInt(str[j]);
					parent[node[stack]] = node[i];
					depth[node[stack]] = depth[i] + 1;
					if (j == 2) {
						c[i].append(stack);
					}else{
						c[i].append(",").append(stack);
					}
				}

			}
		}
		for (int i = 0; i<n ; i++ ) {
			if (depth[i] == 0) {
				parent[i] = -1;
				break;
			}
		}
		for (int j = 0; j<n ; j++ ) {
			for (int i = 0; i<n ; i++ ) {
				if (j == node[i]) {
					
				System.out.print("node " + node[i] + ": ");
				System.out.print("parent = " + parent[i] + ", ");
				System.out.print("depth = " + depth[i] + ", ");
				System.out.print(root(parent[i],c[i],leafint));
				System.out.println(", [" + c[i] +"]");
				continue;
				}
			}
		}
	}

	public static String root(int parent,StringBuilder c,int leafint){
		if (parent == -1) {
			return "root";
		}else if (c.length() == 0) {
			return "leaf";
		}else{
			return " internal node";
		}
	}


	public static StringBuilder toStringBuilder(int[] a){
		StringBuilder sb = new StringBuilder();
		sb.append(a[0]);
		for (int i = 1; i<a.length ; i++ ) {
			sb.append(" ").append(a[i]);
		}

		return sb;
	}

	public static void countingSort(int[] a,int[] b,int max){
		int[] c = new int[max+1];

		for (int j = 0; j<a.length ; j++ ) {
			c[a[j]]++;
		}

		for (int i = 1; i<=max ; i++ ) {
			c[i] = c[i] + c[i-1];
		}

		for (int j = a.length-1; j>=0 ; j-- ) {
			b[c[a[j]]-1] = a[j];
			c[a[j]]--;
		}


	}
}