import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		int[] dArr = new int[N];
		
		int total = 0;
		
		for (int i = 0 ; i < N ; i++) {
			dArr[i] = sc.nextInt();
		}
		
		for(int i = 1 ; i < N ; i++) {
			for(int j = 0 ; j < i ; j++) {
				total += dArr[i] * dArr[j];
			}
		}
		
		System.out.println(total);
	}

}
