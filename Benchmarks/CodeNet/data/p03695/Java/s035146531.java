
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] K = new int[N];
		for(int i = 0 ; i < N ; i++){
			K[i] = sc.nextInt();
		}

		sc.close();

		int[] A = new int[9];

		for(int i = 0 ; i < N ; i++){
			if(K[i]<=399){
				A[0]++;
			}
			else if(K[i]>=400 && K[i] <= 799){
				A[1]++;
			}
			else if(K[i]>=800 && K[i] <= 1199){
				A[2]++;
			}
			else if(K[i]>=1200 && K[i] <= 1599){
				A[3]++;
			}
			else if(K[i]>=1600 && K[i] <= 1999){
				A[4]++;
			}
			else if(K[i]>=2000 && K[i] <= 2399){
				A[5]++;
			}
			else if(K[i]>=2400 && K[i] <= 2799){
				A[6]++;
			}
			else if(K[i]>=2800 && K[i] <= 3199){
				A[7]++;
			}
			else{
				A[8]++;
			}
		}

		int ans = 0;
		for(int i = 0 ; i < 8 ; i++){
			if(A[i]!=0){
				ans++;
			}
		}
		if(ans != 0){
			System.out.println(Math.min(8, ans) + " " + (ans + A[8]));
		}
		else{
			System.out.println(1 + " " + (ans + A[8]));
		}
	}
}
