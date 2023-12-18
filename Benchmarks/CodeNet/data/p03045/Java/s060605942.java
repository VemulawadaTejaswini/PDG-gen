import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<n; i++) {
			graph.add(new LinkedList<Integer>());
		}
		for(int i=0; i<m; i++) {
			arr = sc.nextLine().split(" ");
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			graph.get(x-1).add(y-1);
		}
		sc.close();


		int count = 0;
		int[] segment = new int[n];
		Arrays.fill(segment, -1);
		for(int i=0; i<n; i++) {
			if (segment[i] == -1) {
				segment[i] = count++;
			}
			for(int j: graph.get(i)) {
				segment[j] = segment[i];
			}
		}

		System.out.println(count);
	}
}
