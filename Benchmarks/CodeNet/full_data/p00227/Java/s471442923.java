import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] vegetable = new int[n];
			for(int i = 0; i < n; i++){
				vegetable[i] = sc.nextInt();
			}
			Arrays.sort(vegetable);
			System.out.println(getPrice(vegetable, m));
		}
		sc.close();
	}

	private static int getPrice(int[] v, int m){
		int sum = 0;
		for(int i = 0; i < v.length; i++){
			if((i + 1) % m != 0){
				sum += v[v.length - 1 - i];
			}
		}
		return sum;
	}
}