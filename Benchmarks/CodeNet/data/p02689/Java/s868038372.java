import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		ArrayList<Integer> H = new ArrayList<Integer>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		int[] good = new int[N];
		
		for(int i = 0; i < N; i ++) {
			H.add(stdIn.nextInt());
			good[i] = 1;
		}
		for(int i = 0; i < M; i ++) {
			A.add(stdIn.nextInt());
			B.add(stdIn.nextInt());
		}
		
		for(int i = 0; i < M; i ++) {
			int a = A.get(i) - 1;
			int b = B.get(i) - 1;
			if(H.get(a) < H.get(b)) {
				good[a] = 0;
			}
			if(H.get(b) < H.get(a)) {
				good[b] = 0;
			}
			if(H.get(a) == H.get(b)) {
				good[a] = 0;
				good[b] = 0;
			}
		}
		
		int ans = 0;
		for(int i = 0; i < good.length; i ++) {
			if(0 < good[i]) {
				ans ++;
			}
		}
		System.out.println(ans);
	}
}
