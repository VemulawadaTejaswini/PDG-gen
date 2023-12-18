import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		List<Integer> costs = new ArrayList<>();
		List<Integer> times = new ArrayList<>();
		List<Integer> tmpCosts = new ArrayList<>();
		for(int a = 0 ; a < N ; a++){
			costs.add(sc.nextInt());
			times.add(sc.nextInt());
		}
		sc.close();
		for(int b = 0 ; b < N ; b++){
			if(times.get(b) <= T){
				tmpCosts.add(costs.get(b));
			}
		}
		if(tmpCosts.isEmpty()){
			System.out.println("TLE");
		}else{		
			Collections.sort(tmpCosts);
			System.out.println(tmpCosts.get(0));
		}
	 }
}