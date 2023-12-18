import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		ArrayList<Integer> paper = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			boolean present = paper.contains(a[i]);
			//System.out.println("n=" + n + " i=" + i +" a[i]=" + a[i]+  " present=" + present);
			if(present) {
				
				paper.remove((Integer)a[i]);
			} else {
				paper.add(a[i]);
			}
		}
		
		
		System.out.println(paper.size());
	}

}
