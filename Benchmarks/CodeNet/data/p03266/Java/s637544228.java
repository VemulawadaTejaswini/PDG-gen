import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//C
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans;
		int counter = 0;
		int counterEven = 0;

		for(int i = 1 ; i <= N ; i++){
			if(i%K == 0){
				counter++;
			}
			if(i%K == (K/2)){
				counterEven++;
			}
		}
		ans = (int)Math.pow(counter, 3);

		if(N % 2 == 0){
			ans += (int)Math.pow(counterEven, 3);
		}

		System.out.println(ans);
	}
}