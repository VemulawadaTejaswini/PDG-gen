import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();

		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}

		int total = X;

		for (int i = 0; i < N; i++) {
			for(int d = 0; d <= 100; d++){
				int day = 1 + array[i] * d;
				if(day <= D){
					total++;
				} else {
					break;
				}
			}
		}

		System.out.println(total);
	}
}
