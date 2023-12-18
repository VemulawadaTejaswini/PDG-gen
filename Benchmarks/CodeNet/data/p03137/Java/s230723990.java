import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n > m) n = m;
		ArrayList<Integer> x = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			x.add(sc.nextInt());
		}
		Collections.sort(x);
		ArrayList<Integer> dif = new ArrayList<>();
		for(int i = 1;i < m; i++) {
			dif.add(x.get(i) - x.get(i - 1));
		}
		Collections.sort(dif);
		int num = 0;
		for(int i = 0; i < m - n; i++) {
			num += dif.get(i);
		}
		System.out.println(num);
	}
}