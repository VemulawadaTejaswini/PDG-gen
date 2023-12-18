import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		List<Integer> a = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int s = sc.nextInt();
			ans += s;
			if(s % 10 != 0)
				a.add(s);
		}
		Collections.sort(a);
		if(ans % 10 == 0 && a.size() == 0) {
			System.out.println(0);
			return;
		}
		System.out.println(ans%10==0?ans-a.get(0):ans);
	}

}