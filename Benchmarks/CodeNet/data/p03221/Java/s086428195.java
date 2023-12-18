import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] Y = new int[M];
		List<List<Integer>> answer = new ArrayList<>();
		for(int i=0; i<N; i++){
			answer.add(new ArrayList<Integer>());
		}
		for(int i=0; i<M; i++){
			P[i] = sc.nextInt()-1;
			Y[i] = sc.nextInt()-1;
			answer.get(P[i]).add(Y[i]);
		}
		for(int i=0; i<N; i++){
			Collections.sort(answer.get(i));
		}
		for(int i=0; i<M; i++){
				System.out.printf("%06d%06d\n", P[i]+1, answer.get(P[i]).indexOf(Y[i])+1);
		}
		return;
	}
}
