import java.util.*;

public class Main {
	final int INF = Integer.MAX_VALUE;
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		int MAX = 1000000;
		int [] dpAll = new int[MAX + 1];
		int [] dpOdd = new int[MAX + 1];
		Arrays.fill(dpAll,INF);
		Arrays.fill(dpOdd, INF);
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i = 0; ;i++){
			int sum = i * (i + 1) * (i + 2) / 6;
			if(sum > MAX) break;
			data.add(sum);
		}
		int len = data.size();
		for(int i=0; i < len; i++){
			int value = data.get(i);
			dpAll[value] = 1;
			if(value % 2 == 1){
				dpOdd[value] = 1;
			}
		}
		
		for(int i=0; i <MAX; i++){
			for(int j = 0;j < len; j++ ){
				int ind = i + data.get(j);
				if(ind <= MAX){
					int value = dpAll[i] + 1;
					dpAll[ind] = Math.min(value, dpAll[ind]);
					if(dpOdd[i] != INF && data.get(j) % 2 == 1){
						value = dpOdd[i] + 1;
						dpOdd[ind] = Math.min(value, dpOdd[ind]);
					}
				}
			}
		}
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(dpAll[n] + " " + dpOdd[n]);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}