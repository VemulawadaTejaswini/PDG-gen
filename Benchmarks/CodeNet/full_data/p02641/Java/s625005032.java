import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		Set<Integer> p = new HashSet<>();
		for(int i = 0; i < N; i++)
			p.add(sc.nextInt());
		int ans = 0, min = Integer.MAX_VALUE/2;
		for(int i = -100; i <= 200; i++)
			if(!p.contains(i) && Math.abs(i-X) < min) {
				ans = i;
				min = Math.abs(i-X);
			}
		System.out.println(ans);
	}

}