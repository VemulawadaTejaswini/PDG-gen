import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			int sum = 0;
			for(int i = 0; i < k; i++){
				sum += array[i];
			}
			
			int max = sum;
			for(int i = 0, m = k; m < n; i++, m++){
				sum += array[m] - array[i];
				max = Math.max(sum, max);
			}
			
			System.out.println(max);
		}
		
	}
}