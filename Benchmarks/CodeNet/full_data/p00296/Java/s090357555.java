import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int []a = new int[M];
		int []q = new int[Q];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < Q; i++) {
			q[i] = sc.nextInt();
		}
		sc.close();
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < N; i++) {
			list.add(i);
			set.add(i);
		}
		int id = 0;
		int n = N;
		for(int i = 0; i < M; i++) {
			if(a[i] % 2 == 0) {
				id += a[i];
				id %= n;
				set.remove(list.get(id));
				list.remove(id);
				//id++;
			}else {
				id -= (a[i] % n);
				id += n;
				id %= n;
				set.remove(list.get(id));
				list.remove(id);
				//id++;
			}
			n--;
		}
		for(int i = 0; i < Q; i++) {
			if(set.contains(q[i])) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
