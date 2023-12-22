import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) S[i] = input.nextInt();
		
		int q = input.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) T[i] = input.nextInt();
		
		int count = 0;
		for (int i = 0; i < n; i++){
			if (Arrays.binarySearch(T, S[i]) >= 0) count++;
		}
		
		System.out.println(count);
	}
}