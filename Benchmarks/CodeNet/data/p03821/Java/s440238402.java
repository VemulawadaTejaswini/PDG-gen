import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = in.nextInt();
		int[] a = new int[n], b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		int sum = 0;
		for(int i = n - 1; i > -1; i--){
			int j = 0;
			while((a[i] + sum + j) % b[i] != 0){
				j++;
			}
			sum += j;
		}
		System.out.println(sum);
	}
}