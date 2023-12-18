import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static Node[] nodeArray;
	static Node root;

	public static void main(String[] args) {
		readInput();

		solve();
	}

	static void solve() {
		boolean[] isSearched = new boolean[N+1];
		Deque<Integer> sortedNode = new ArrayDeque<>(N+1);
		
		for(int i = 1; i<=N; i++) {
			recursiveSearch(i, isSearched, sortedNode);
		}
		
		Integer[] sortedNodeArray = new Integer[sortedNode.size()];
		sortedNode.toArray(sortedNodeArray);
		
		int[] parentList = new int[N+1];
		
		for(int i = sortedNodeArray.length - 1; i>=0; i--) {
			int nodeId = sortedNodeArray[i];
			
			for(int j = i-1; j<=0; j--) {
				if(nodeArray[nodeId].parents.contains(sortedNodeArray[j])) {
					parentList[nodeId] = sortedNodeArray[j];
					break;
				}
			}
		}
		
		for(int i = 1; i<=N; i++) {
			System.out.println(parentList[i]);
		}
	}
	
	static void recursiveSearch(int nodeId, boolean[] isSearched, Deque<Integer> queue) {
		if(isSearched[nodeId]) {
			return;
		}
		
		isSearched[nodeId] = true;
		
		for(int childId : nodeArray[nodeId].children) {
			recursiveSearch(childId, isSearched, queue);
		}
		
		queue.addFirst(nodeId);
	}

	static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();
			M = sc.nextInt();

			nodeArray = new Node[N+1];

			for(int i = 0; i<nodeArray.length; i++) {
				nodeArray[i] = new Node(i);
			}

			// 辺の情報を読み込む
			for(int i = 0; i<(N - 1 + M); i++) {
				int s = sc.nextInt();
				int d = sc.nextInt();

				nodeArray[d].parents.add(s);
				nodeArray[s].children.add(d);
			}
		}
	}

	static class Node{
		public int id;
		public ArrayList<Integer> parents;
		public ArrayList<Integer> children;

		public Node(int id) {
			this.id = id;
			parents = new ArrayList<>();
			children = new ArrayList<>();
		}
	}
}
