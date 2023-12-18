import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] add = new int[n];
		int max = 0;
		int min = 100;

		for(int i = 0;i < n;i++) {
			add[i] = stdIn.nextInt();
			if(add[i]>max) {
				max = add[i];
			}
			if(add[i]<min) {
				min = add[i];
			}
		}


		int answer =1000000000;

		for(int i = min;i<max;i++) {
			int ans = 0;
			for(int j = 0;j < n;j++) {
				ans = ans + ((add[j]-i)*(add[j]-i));
			}
			if(ans < answer) {
				answer = ans;
			}
		}

		System.out.println(answer);

	}

}
