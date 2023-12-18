import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] Y = new int[M];
		int[] num = new int[M];
		List<List<Integer>> number = new ArrayList<>();
		List<List<Integer>> answer = new ArrayList<>();
		for(int i=0; i<N; i++){
			number.add(new ArrayList<Integer>());
			answer.add(new ArrayList<Integer>());
		}
		for(int i=0; i<M; i++){
			P[i] = sc.nextInt()-1;
			Y[i] = sc.nextInt()-1;
			num[i] = number.get(P[i]).size();
			number.get(P[i]).add(Y[i]);
		}
		for(int i=0; i<N; i++){
			for(int j=0,l=number.get(i).size(); j<l; j++){
				int min = 0;
				for(int k=1,m=number.get(i).size()/*l-j*/; k<m; k++){
					if(number.get(i).get(k) < number.get(i).get(min)){
						min = k;
					}
				}
				answer.get(i).add(min+j);
				number.get(i).remove(min);
			}
		}
		for(int i=0; i<M; i++){
			System.out.printf("%06d%06d\n", P[i]+1, answer.get(P[i]).get(num[i])+1);
		}
		return;
	}
}
