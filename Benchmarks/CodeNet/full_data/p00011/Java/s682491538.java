import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] horizontalLine = new int[n][2];
		String[] input = null;
		for(int i = 0; i < n; i++){
			input = sc.next().split(",");
			horizontalLine[i][0] = Integer.parseInt(input[0]);
			horizontalLine[i][1] = Integer.parseInt(input[1]);
		}
		int[] result = solve(w, horizontalLine);
		for(int i : result){
			System.out.println(i);
		}
		sc.close();
	}

	public static int[] solve(int numVerticalLines, int[][] horizontalLine){
		//initialize
		int[] n = new int[numVerticalLines];
		for(int i = 0; i < numVerticalLines; i++){
			n[i] = i + 1;
		}
		
		//solve
		for(int i = 0; i < horizontalLine.length; i++){
			int source = horizontalLine[i][0] - 1;
			int target = horizontalLine[i][1] - 1;
			int tmp = n[source];
			n[source] = n[target];
			n[target] = tmp;
		}
		return n;
	}
}