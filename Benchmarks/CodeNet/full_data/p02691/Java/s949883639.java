import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] height = new int[n];
			int ans = 0;
			
			for(int i = 0; i < n; i++){
				height[i] = sc.nextInt();
			}

			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					int heightSum = height[i] + height[j];
					int numDif = Math.abs(i - j);
					if(heightSum == numDif) {
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		}
	}
}
