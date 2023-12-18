import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		int topCount = 0;
		for (int i = 0; i < N; i++) {
			int rate = sc.nextInt();
			int rank = classifiy(rate);
			if (rank == 9) {
				topCount++;
				continue;
			}
			
			set.add(rank);
		}
		
		int min = Math.max(set.size(), 1);
		int max = set.size() + topCount;
		System.out.println(min + " " + max);
		
	}
	
	static int classifiy(int rate) {
		if (rate < 400) {
			return 1;
		} else if (rate < 800) {
			return 2;
		} else if (rate < 1200) {
			return 3;
		} else if (rate < 1600) {
			return 4;
		} else if (rate < 2000) {
			return 5;
		} else if (rate < 2400) {
			return 6;
		} else if (rate < 2800) {
			return 7;
		} else if (rate < 3200) {
			return 8;
		} else {
			return 9;
		}
	}

}