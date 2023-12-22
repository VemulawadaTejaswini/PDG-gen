import java.util.Arrays;
import java.util.Scanner;


public class A {

	public static final int MAX = 123456 * 2;
	public static final int SQT = (int) Math.ceil(Math.sqrt(MAX));
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] sums = new int[MAX + 1];
		Arrays.fill(sums, 1);
		sums[0] = sums[1] = 0;
		
		for(int i = 2; i <= MAX; i++){
			if(sums[i] > 0){
				for(int j = i * 2; j <= MAX; j += i){
					sums[j] = 0;
				}
			}
		}
		
		for(int i = 1; i <= MAX; i++){
			sums[i] += sums[i-1];
		}
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(sums[2 * n] - sums[n]);
		}

	}

}