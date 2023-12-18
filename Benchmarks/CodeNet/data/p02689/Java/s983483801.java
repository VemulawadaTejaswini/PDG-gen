import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		ArrayList<Long> H = new ArrayList<Long>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			H.add(stdIn.nextLong());
		}
		for(int i = 0; i < M; i ++) {
			A.add(stdIn.nextInt());
			B.add(stdIn.nextInt());
		}
		
		int ans = 0;
		
		for(int i = 0; i < N; i ++) {
			boolean isGood = false;
			int connect = 0;
			for(int j = 0; j < M; j ++) {
				int a = A.get(j) - 1;
				int b = B.get(j) - 1;
				if(i == a) {
					connect ++;
					if(H.get(b) < H.get(a)) {
						isGood = true;
					}else {
						isGood = false;
						break;
					}
				}else if(i == b) {
					connect ++;
					if(H.get(a) < H.get(b)) {
						isGood = true;
					}else {
						isGood = false;
						break;
					}
				}
			}
			if(isGood || connect == 0) {
				ans ++;
			}
		}
		System.out.println(ans);
	}
}