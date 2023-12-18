import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //Consider repetition
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int ans=1;
		boolean[] pos = new boolean[N+1]; //Whether red ball can remain in box i
		int[] cnt = new int[N+1]; //How many balls in each box
		Arrays.fill(cnt, 1); //LMAO
		pos[1]=true;
		for (int i = 0; i < M; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			if (pos[A]) {
				cnt[A]--;
				cnt[B]++;
				if (!pos[B]) {
					pos[B]=true;
					ans++;
				}
				if (cnt[A]==0) {
					ans--;
					pos[A]=false; //Box is literally empty
				}
			}
		}
		System.out.println(ans);
	}
}