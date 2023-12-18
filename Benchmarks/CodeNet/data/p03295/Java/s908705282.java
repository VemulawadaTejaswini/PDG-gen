import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] ab = new int[M][2];
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			ab[i][0] = a;
			ab[i][1] = b;
		}
		
		Arrays.sort(ab, new edgeComparator());
		
		/*
		for(int i = 0; i < M; i++){
			System.out.println(ab[i][0] + " " + ab[i][1]);
		}
		*/
		
		
		int ans = 0;
		int preVisitedIndex = -1;
		
		for(int i = 0; i < M; i++){
			int a = ab[i][0] - 1;
			int b = ab[i][1] - 1;
			
			if(preVisitedIndex >= a && preVisitedIndex < b)
				continue;
			
			preVisitedIndex = b - 1;
			ans++;
		}
		
		System.out.println(ans);
	}
	
	public static class edgeComparator implements Comparator<int[]> {

		@Override
		public int compare(int[] e1, int[] e2) {
			return e1[1] < e2[1] ? -1 : 1;
		}
	}
}