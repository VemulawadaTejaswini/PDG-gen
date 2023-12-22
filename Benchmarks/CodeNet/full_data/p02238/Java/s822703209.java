//template code, C343, 2019
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	
	static int totalVertex;
	static ArrayList<ArrayList<Integer>> adjList;
	static ArrayList<Integer> undiscovered;
	static int[] findTimes;
	static int[] completeTimes;
	static int time = 0;
	static int currentVertex = 0;
	
	public static void main(String argv[]) {
		
		getInput();
		
		findTimes = new int[totalVertex];
		completeTimes = new int[totalVertex];
		undiscovered = new ArrayList<Integer>();
		
		for(int i = 0; i < totalVertex; i++) {
			findTimes[i] = -1;
			completeTimes[i] = -1;
			
			undiscovered.add(i);
		}
		
		while(undiscovered.isEmpty() == false) {
			searchVertex(undiscovered.get(0));
		}
		
		for(int i = 0; i < totalVertex; i++) {
			System.out.println((i+1) + " " + findTimes[i] + " " + completeTimes[i]);
		}
		
		
	}
	
	public static void searchVertex(int i) {
		
		time++;
		undiscovered.remove(undiscovered.indexOf(i));
		
		findTimes[i] = time;
		
		for(Iterator iter = adjList.get(i).iterator(); iter.hasNext();) {
			int temp = (int)iter.next();
			if(undiscovered.contains(temp)) searchVertex(temp);
		}
		
		time++;
		completeTimes[i] = time;
		
		
	}
	
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
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
}
