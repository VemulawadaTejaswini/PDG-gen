import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		int ans = 0;
		for(int i = 0; i < N; i++)
			a.add(sc.nextInt());
		Collections.sort(a);
		while(a.size() != 0) {
			int min = a.get(0);
			if(min <= a.size()) {
				if(a.get(min-1) == min) {
					a.subList(0, min).clear();
					while(a.size() != 0 && a.get(0) == min) {
						ans += 1;
						a.remove(0);		
					}
				}
				else {
					a.subList(0, min).clear();
					ans += min;
				}
			}
			else {
				ans += a.size();
				a.clear();
			}

		}
		System.out.println(ans);

	}

}