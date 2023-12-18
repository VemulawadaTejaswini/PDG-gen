import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long count = 0;
		Integer[] enemy = new Integer[N];
		for (int i = 0; i < N; i++) {
			enemy[i]= sc.nextInt();
		}
		Arrays.sort(enemy, Collections.reverseOrder());
		for (int i = K; i < N; i++) {
			count += enemy[i];
		}
		System.out.println(count);
	}
}