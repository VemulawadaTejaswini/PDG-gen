import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		ArrayList<Integer> H = new ArrayList<Integer>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		HashMap<Integer, Boolean> good = new HashMap<Integer, Boolean>();
		for(int i = 0; i < N; i ++) {
			H.add(stdIn.nextInt());
		}
		for(int i = 0; i < M; i ++) {
			A.add(stdIn.nextInt());
			B.add(stdIn.nextInt());
		}
		for(int i = 0; i < N; i ++) {
			good.put(i, true);
		}
		
		int ans = 0;
		
		for(int i = 0; i < M; i ++) {
			int a = A.get(i) - 1;
			int b = B.get(i) - 1;
			if(H.get(a) < H.get(b)) {
				good.remove(a);
				good.put(a, false);
			}
			if(H.get(b) < H.get(a)) {
				good.remove(b);
				good.put(b, false);
			}
			if(H.get(a) == H.get(b)) {
				good.remove(a);
				good.put(a, false);
				good.remove(b);
				good.put(b, false);
			}
		}
		
		for(int i = 0; i < N; i ++) {
			if(good.get(i) == true) {
				ans ++;
			}
		}
		System.out.println(ans);
	}
}