import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //GIMME AC
		Scanner input = new Scanner(System.in); 
		int N = input.nextInt();
		String x = input.next();
		int[][] pref = new int[N+1][10]; //How many 1,2,3...,9 occurrences up to index i
		boolean[] first = new boolean[10]; //Was first digit ever 0,1,2,3,..,9
		int ans = 0;
		//If so, DON'T recalculate
		for (int i = 0; i < N; i++) {
			for (int p = 0; p <= 9; p++) {
				pref[i+1][p]=pref[i][p]; //Need to store previous data
			}
			int digit = Integer.parseInt(x.substring(i,i+1));
			pref[i+1][digit]++;
		}
		for (int i = 0; i < N; i++) {
			int digit = Integer.parseInt(x.substring(i,i+1));
			if (!first[digit]) {
				first[digit]=true;
				boolean[] second = new boolean[10]; //Was second digit "          "
				for (int next = i+1; next < N; next++) {
					int d = Integer.parseInt(x.substring(next,next+1));
					if (!second[d]) {
						second[d]=true;
						for (int p = 0; p <= 9; p++) {
							if (pref[N][p]-pref[next+1][p]>0) { //Why next+1???
								ans++;
							} 
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
