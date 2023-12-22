import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] DP = new int[100001];
		int[] ODD_DP = new int[100001];
		
		Arrays.fill(DP, -1);
		Arrays.fill(ODD_DP, -1);
		
		DP[0] = 0;
		ODD_DP[0] = 0;
		
		for(int i = 0; i < 58; i++){
			int number = ((i + 1) * (i + 2) * (i + 3)) / 6;
			
			for(int j = 0; j <= (100000 - number); j++){
				if(DP[j] != -1){
					if(DP[j + number] == -1){
						DP[j + number] = DP[j] + 1;
					}else if(DP[j + number] > DP[j] + 1){
						DP[j + number] = DP[j] + 1;
					}
				}
			}
			
			if(number % 2 == 1){
				for(int j = 0; j <= (100000 - number); j++){
					if(ODD_DP[j] != -1){
						if(ODD_DP[j + number] == -1){
							ODD_DP[j + number] = ODD_DP[j] + 1;
						}else if(ODD_DP[j + number] > ODD_DP[j] + 1){
							ODD_DP[j + number] = ODD_DP[j] + 1;
						}
					}
				}
			}
		}
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(DP[n] + " " + ODD_DP[n]);
			
		}
		
		sc.close();
	}
}