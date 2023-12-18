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
		
		HashMap<Integer, Boolean> notGood = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i < N; i ++) {
			H.add(stdIn.nextInt());
		}
		for(int i = 0; i < M; i ++) {
			A.add(stdIn.nextInt());
			B.add(stdIn.nextInt());
		}
		
		for(int i = 0; i < M; i ++) {
			int a = A.get(i) - 1;
			int b = B.get(i) - 1;
			if(H.get(a) < H.get(b)) {
				if(notGood.get(a) == null) {
					notGood.put(a, false);
				}
			}
			if(H.get(b) < H.get(a)) {
				if(notGood.get(b) == null) {
					notGood.put(b, false);
				}
			}
			if(H.get(a) == H.get(b)) {
				if(notGood.get(a) == null) {
					notGood.put(a, false);
				}
				if(notGood.get(b) == null) {
					notGood.put(b, false);
				}
			}
		}
		System.out.println(N - notGood.size());
	}
}