import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer> contains = new HashSet<>();
		contains.add(0);
		int numBalls[] = new int[n];
		for(int i=0;i<n;i++) {
			numBalls[i] = 1;
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			numBalls[a]--;
			numBalls[b]++;
			if(contains.contains(a)) {
				contains.add(b);
			}
			if(numBalls[a]==0) {
				if(contains.contains(a)) {
					contains.remove(a);
				}
			}
		}
		System.out.println(contains.size());
	}
}
