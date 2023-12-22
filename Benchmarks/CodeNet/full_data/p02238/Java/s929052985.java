//template code, C343, 2019
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

class Depth {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Depth() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}

	private int time;
	private Integer[][] table;
	public void depthSearch() {
		table = new Integer[totalVertex][3];
		for(Integer[] i : table)
		{
			i[0] = -1; 
		}
		time = 0;
		depthSearchHelper(0);
		for(int i = 0; i < table.length - 1 ; i++)
		{
			if(table[i][0] == -1)
			{
				depthSearchHelper(i);
			}
			System.out.println(table[i][0] + 1 + " " + table[i][1] + " " + table[i][2]);
		}
		if(table[table.length-1][0] == -1)
		{
			depthSearchHelper(table.length-1);
		}
		System.out.println(table[table.length-1][0] + 1 + " " + table[table.length-1][1] + " " + table[table.length-1][2]);
		
	}

	public void depthSearchHelper(int n) {
		time++;
		table[n][0] = n;
		table[n][1] = time;
		LinkedList<Integer> paths = adjList.get(n);
		if(paths.size() == 0)
		{
			table[n][2] = ++time;
		}else
		{
			for(int i: paths)
			{
				boolean test = true;
				for(Integer[] j : table)
				{
					if(j[0] == i)
					{
						test = false;
					}
				}
			
				if(test == true)
				{
					depthSearchHelper(i);
				}
			}
			table[n][2] = ++time;
		}
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main{
	public static void main(String argv[]) {
		Depth g = new Depth();
		g.loadAdjList();
		g.depthSearch();
	}
}
