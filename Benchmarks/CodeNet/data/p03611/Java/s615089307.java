
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		List<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			m.put(v, m.containsKey(v) ? m.get(v)+1 : 1);
			a.add(v);
		}
		Collections.sort(a);
		a = a.stream().distinct().collect(Collectors.toList());

		long sum = 0;
		long ans = 0;
		for(int i=0; i<a.size(); i++) {
			if(i>2) {
				sum -= m.get(a.get(i-3));
			}
			if(i>0 && Math.abs(a.get(i-1) - a.get(i))<=1) {
				sum += m.get(a.get(i));
			}else {
				sum = m.get(a.get(i));
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
		sc.close();
	}





}
