import java.util.Arrays;
import java.util.Scanner;

class Katana implements Comparable<Katana>{
	int a, b;
	public Katana(int _a, int _b) {
		a = _a; b = _b;
	}
	public int compareTo(Katana k) {
		return k.b - b;
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), H = sc.nextInt();
		int max_A = 0, sum_B = 0;
		Katana[] kt = new Katana[N];
		for(int i = 0; i < N; i++) {
			kt[i] = new Katana(sc.nextInt(), sc.nextInt());
			max_A = Math.max(max_A, kt[i].a);
		}
		int ans = (H + max_A - 1) / max_A; // 何も投げない
		Arrays.sort(kt);

		for(int i = 0; i < N; i++) {
			sum_B += kt[i].b;
			ans = Math.min(ans, (H - sum_B + max_A - 1) / max_A + (i + 1));
		}
		System.out.println(ans);
	}
}