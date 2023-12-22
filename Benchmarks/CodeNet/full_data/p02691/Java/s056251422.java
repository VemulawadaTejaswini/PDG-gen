import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
			}
			
			int ans = 0;

			for(int i = 0 ; i < n - 1; i++ ) {
				for(int j = i+1 ; j < n ; j++ ) {
					int indexDiff = j - i;
					int numberSum = aArray[i] + aArray[j];
					
					if ( indexDiff == numberSum) {
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}