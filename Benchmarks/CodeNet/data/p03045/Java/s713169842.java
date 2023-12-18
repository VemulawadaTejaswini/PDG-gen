package atcoder;

import java.util.Scanner;

public class Main {
	int [] arr;
	int cnt = 0;

	int N,M;
	private Scanner kb;
	public void process() {
		kb = new Scanner(System.in);
		N = kb.nextInt();
		M = kb.nextInt();
		arr = new int[N+1];
		for(int i=0; i<M; i++) {
			int s = kb.nextInt();
			int m = kb.nextInt();
			int z = kb.nextInt();
			
			if(z%2 == 0) {
				arr[s] = 2;
				arr[m] = 2;
			}
			else {
				arr[s] = 2;
				arr[m] = 0;
			}
				
		}
		for(int i=1; i<N+1; i++) {
			if(arr[i] == 0)
				cnt++;
		}
		System.out.println(cnt);
	}
	public static void main(String [] args) {
		Main app = new Main();
		app.process();
	}
}
