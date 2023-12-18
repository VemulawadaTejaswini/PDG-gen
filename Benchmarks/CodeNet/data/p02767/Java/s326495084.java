import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int hito[] = new int[N];
		int min = 0;
		int max = 0;

		for(int i=0; i < N; i++){
			hito[i] = scan.nextInt();
		}

		Arrays.sort(hito);
		min = hito[0];
		max = hito[N - 1];
		
		int minsum = 0;

		for(int i = min ; i <= max ; i++){
			int sum = 0;
			int P = i;
			for(int j=0; j < N; j++){
				sum = sum + (int)(Math.pow(hito[j] - P, 2));
			}
			if (i == min || sum < minsum) {
				minsum = sum;
			}
		}
		System.out.println(minsum);

	}
}