import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		long m = Long.parseLong(sc.next());

		ArrayList<Integer> aArrayList = new ArrayList<>();

		for (int i=0; i<m; i++){
			aArrayList.add(Integer.parseInt(sc.next()));
		}

		ArrayList<Long> dp = new ArrayList<>();
		dp.add(1L);
		if (aArrayList.contains(1L)){
			dp.add(0L);
		}else {
			dp.add(1L);
		}

		for (int i = 2; i <= n; i++) {
			long tmp = 0L;
			if (!aArrayList.contains(i-2)){
				tmp += dp.get(i-2) % 1000000007;
			}
			if (!aArrayList.contains(i-1)){
				tmp += dp.get(i-1) % 1000000007;
			}
			dp.add(tmp);
		}
		System.out.println(dp.get(n) % 1000000007);
	}
}