import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] sushi = new int[N][2];
		for(int i = 0; i < N; i++) {
			sushi[i][0] = sc.nextInt();
			sushi[i][1] = sc.nextInt();
		}
		Arrays.sort(sushi, (x,y) -> y[1]-x[1]);
		Set<Integer> used = new HashSet<>();
		Map<Integer, Integer> n = new HashMap<>();
		long sat = 0;
		for(int i = 0; i < K; i++) {
			sat += sushi[i][1];
			used.add(sushi[i][0]);
			if(n.containsKey(sushi[i][0]))
				n.put(sushi[i][0], n.get(sushi[i][0])+1);
			else
				n.put(sushi[i][0], 1);
		}
		sat += (long)used.size()*used.size();
		long newsat = sat;
		int x = K;
		for(int i = K-1; i >= 0; i--) {
			int t = n.get(sushi[i][0]);
			if(t > 1) {
				n.put(sushi[i][0], t-1);
				for(int j = x; j < N; j++) {
					if(!used.contains(sushi[j][0])) {
						used.add(sushi[j][0]);
						n.put(sushi[j][0], 1);
						newsat += -sushi[i][1]+sushi[j][1]+2*used.size()-1;
						sat = Math.max(sat, newsat);
						x = j+1;
						break;
					}
				}
			}
		}
		System.out.println(sat);
	}

}