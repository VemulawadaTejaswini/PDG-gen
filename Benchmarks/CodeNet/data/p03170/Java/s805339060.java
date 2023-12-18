import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		int N = console.nextInt();
		int K = console.nextInt();

		int[] steps = new int[N];
		int[] status = new int[K+1];

		for(int i = 0; i < N; ++i){
			steps[i] = console.nextInt();
			status[steps[i]] = 1;
		}

		for (int k = 1; k<= K; k++){
			status[k] = 0;

			for (int i = 0; i < N; i++){
				int kDash = k-steps[i];
				if(kDash >= 0 && status[kDash] == 0){
					status[k] = 1;
				}
			}

		}
		if(status[K]==1){
			System.out.println("First");
		}
		else{
			System.out.println("Second");
		}
	}
}