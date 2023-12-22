import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);

	static int n, m;
	static int[][] node;


	public static void main(String[] args) {
		while(read()){
			solve();
		}

	}

	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		if(n == 0 && m == 0)  return false;

		node = new int[n][n];  //£sñ

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==j) node[i][j] = 0;
				else     node[i][j] = -1;
			}
		}

		for(int i=0; i<m; i++){
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			int cost = sc.nextInt();

			node[node1][node2] = cost;
			node[node2][node1] = cost;
		}

		return true;
	}


	static void solve(){
		//v@ÅÀ
		int sum =0;
		HashSet<Integer> X = new HashSet<Integer>();  //èÏÝ
		HashSet<Integer> Y = new HashSet<Integer>();  //¢è

		for(int i=1; i<n; i++){
			Y.add(i);
		}
		X.add(0);

		//¢èÌWªóÉÈéÜÅ
		while(!Y.isEmpty()){
			//System.out.println("X:" + X);
			//System.out.println("Y:" + Y);

			//Å¬RXgÌ×Úm[hð²×é
			int min = Integer.MAX_VALUE;
			int min_num = -1, min_num2 = -1;

			for(Iterator<Integer> i1 = X.iterator(); i1.hasNext();){
				int n1 = i1.next();
				for (Iterator<Integer> i2 = Y.iterator(); i2.hasNext();){
					int n2 = i2.next();
					//System.out.println(n1 + " " + n2);
					if(node[n1][n2] == -1)  continue;

					if(min > node[n1][n2]){
						min = node[n1][n2];
						min_num = n1;
						min_num2 = n2;
					}
				}
			}

			sum += node[min_num][min_num2];
			Y.remove(min_num2);
			X.add(min_num2);

		}

		System.out.println(sum);  //oÍ
	}

}