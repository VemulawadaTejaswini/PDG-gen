import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i = 0;i < N;++i)
			d[i] = sc.nextInt();
		sc.close();
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i < N;++i)
			set.add(d[i]);
		System.out.println(set.size());
	}
}
