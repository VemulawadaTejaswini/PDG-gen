import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] A = new int[N][3];
		for(int i = 0; i < N; i++) {
			A[i][0] = s.nextInt();
			A[i][1] = s.nextInt();
			A[i][2] = s.nextInt();
		}
		
		Queue<int[]> q = new ArrayDeque<>();
		
		int[] start1 = {0, A[0][0], 1}; // 前、幸福度、N + 1日目
		q.add(new int[]{0, A[0][0], 1});
		q.add(new int[]{1, A[0][1], 1});
		q.add(new int[]{2, A[0][2], 1});

		int[] tmp;
		int a = 0;
		int b = 0;
		int result = 0;
		if(N == 1) {
			result = Math.max(A[0][0], A[0][1]);
			result = Math.max(A[0][2], result);
			System.out.println(result);
			return;
		}
		while(!q.isEmpty()) {
			tmp = q.poll();
			a = (tmp[0] + 1) % 3;
			b = (tmp[0] + 2) % 3;
			if(tmp[2] == N - 1) {
				result = Math.max(tmp[1] + A[tmp[2]][a], result);
				result = Math.max(tmp[1] + A[tmp[2]][b], result);
				continue;
			}
			q.add(new int[] {a, tmp[1] + A[tmp[2]][a], tmp[2] + 1});
			q.add(new int[] {b, tmp[1] + A[tmp[2]][b], tmp[2] + 1});
		}
		System.out.println(result);
    }
}