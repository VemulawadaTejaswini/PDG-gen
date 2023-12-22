import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			TreeSet<Integer> set = new TreeSet<Integer>();
			int[][] post = new int[n][3];
			
			for(int i = 0; i < n; i++){
				post[i][0] = sc.nextInt();
				post[i][1] = sc.nextInt();
				post[i][2] = sc.nextInt();
			
				set.add(post[i][1]);
				set.add(post[i][2]);
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>(set);
			int[] array = new int[set.size()];
			
			//System.out.println(set);
			
			int max = 0;
			for(int i = 0; i < n; i++){
				final int end = Collections.binarySearch(list, post[i][2]);
				
				for(int j = Collections.binarySearch(list, post[i][1]); j < end; j++){
					array[j] += post[i][0];
					max = Math.max(max, array[j]);
				}
			}
			
			System.out.println(max > 150 ? "NG" : "OK");
		}
	}

}