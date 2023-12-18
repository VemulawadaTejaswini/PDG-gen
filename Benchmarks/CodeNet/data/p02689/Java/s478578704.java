import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] H = new long[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		
		ArrayList<ArrayList<Integer>> vertex = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			ArrayList<Integer> v = new ArrayList<>();
			vertex.add(v);
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			vertex.get(a).add(b);
			vertex.get(b).add(a);
		}
		
		boolean[] OK = new boolean[N];
		Arrays.fill(OK, true);
		
		for(int i = 0; i < N; i++) {
			if(OK[i]) {
				ArrayList<Integer> v = vertex.get(i);
				for(int j = 0; j < v.size(); j++) {
					int x = v.get(j);
					if(H[i] > H[x]) {
						OK[x] = false;
					}
					else {
						OK[i] = false;
					}
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(OK[i])count++;
		}
		System.out.println(count);
		sc.close();
	}
}