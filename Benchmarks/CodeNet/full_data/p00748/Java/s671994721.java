import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static int[][] pollock = new int[2][1000000];

	static void Conjecture(){
		int n = 1;
		Arrays.fill(pollock[0], 1000000);
		Arrays.fill(pollock[1], 1000000);

		while(n*(n+1)*(n+2)<1000000*6){
			pollock[0][n*(n+1)*(n+2)/6] = 1;
			if((n*(n+1)*(n+2)/6)%2==1){
				pollock[1][n*(n+1)*(n+2)/6] = 1;
			}
			n++;
		}

		n = 1;
		for(int i=2; i<1000000; i++){
			if(pollock[0][i]==1) n++;

			for(int j=1; j<=n; j++){
				pollock[0][i] = Math.min(pollock[0][i], pollock[0][i-j*(j+1)*(j+2)/6]+1);
				if((j*(j+1)*(j+2)/6)%2==1){
					pollock[1][i] = Math.min(pollock[1][i], pollock[1][i-j*(j+1)*(j+2)/6]+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conjecture();

		while(true){
			int num = sc.nextInt();
			if(num==0) break;
			System.out.println(pollock[0][num] + " " + pollock[1][num]);
		}
	}
}