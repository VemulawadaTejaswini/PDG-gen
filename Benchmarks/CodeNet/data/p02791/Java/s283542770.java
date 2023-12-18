import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] suuji = new int[N];
		//初まりの数字もカウントに入れておく
		int count = 1;
		for(int i = 0; i < N ; i++) {
			suuji[i] = sc.nextInt();
		}
		int min = suuji[0];
		for(int i = 1; i<N; i++) {
			if(min > suuji[i]) {
				min = suuji[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
