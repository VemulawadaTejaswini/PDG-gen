import java.util.Scanner;

public class Main {
	
	private static String judgeDists(int[] dists, int k) {
		// validate inputs
		if(k < 0 || k > 123) return ":(";
		for(int tmp : dists) {
			if (tmp < 0 || tmp > 123) return ":(";
		}
		
		// using 2 loops to judge the dists
		for(int i = 0; i < dists.length; i++){
			for(int j = i + 1; j < dists.length; j++){
				if(dists[j] - dists[i] > k) return ":(";
			}
		}
		
		return "Yay!";
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] dists = new int[5];
		// get values for 5 antennas and val for k
		dists[0] = sc.nextInt();
		dists[1] = sc.nextInt();
		dists[2] = sc.nextInt();
		dists[3] = sc.nextInt();
		dists[4] = sc.nextInt();
		
		int k = sc.nextInt();
		System.out.println(judgeDists(dists, k));
	}
}