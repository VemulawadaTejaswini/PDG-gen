import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		
		int sum = 0;
		for(int i=0;i<n;i++){
			sum = sum + array[i];
			if(sum > x){
				System.out.println(i);
				return;
			}else if(sum == x){
				System.out.println(i+1);
				return;
			}
		}
		
		
		System.out.println(n-1);
	}
}