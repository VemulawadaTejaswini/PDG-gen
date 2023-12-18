import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		List<Integer> l = new ArrayList<>(), r = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			l.add(sc.nextInt());
			r.add(sc.nextInt());
		}
		Collections.sort(l);
		Collections.sort(r);
		
		int left = l.get(l.size()-1);
		int right = r.get(0);
		
		int ans = right-left+1;
		System.out.println(ans);
	}
}
