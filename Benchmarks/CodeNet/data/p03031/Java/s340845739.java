import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int ans = 0;
		ArrayList<Integer>[] bulbs = new ArrayList[M];
		int[] p = new int[M];
		for (int i = 0; i < M; i++) {
			bulbs[i]=new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++){
			int num = input.nextInt();
			for (int next = 0; next < num; next++) {
				bulbs[i].add(input.nextInt());
			}
		}
		for (int i = 0; i < M; i++) {
			p[i]=input.nextInt();
		}
		//1<<N creates N slots of 0 and 1 placements
		for (int mask = 0; mask < (1<<N); mask++) { //2^N possibilities due to taking or not taking 
			//allowing for 2 options for each step in the N slots
			int[] cnts = new int[M];
			boolean good=true;
			for (int i = 0; i < N; i++) {
				int curnum = mask>>i;
				//System.out.print(curnum%2);
				if (curnum%2==1) {
					for (int bulb = 0; bulb < M; bulb++) {
						if (bulbs[bulb].contains(i+1)) cnts[bulb]++;
					}
				}
			}
			for (int i = 0; i < M; i++) {
				if (cnts[i]%2!=p[i]) good=false;
			}
			if (good) ans++;
			//System.out.print("\n");
		}
		System.out.println(ans);
	}	
}