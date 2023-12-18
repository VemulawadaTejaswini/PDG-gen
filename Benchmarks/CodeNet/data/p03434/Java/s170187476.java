import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		//		int K = scan.nextInt();

		int data[] = new int[N];
		for(int i = 0;i < N;i++){
			data[i] = scan.nextInt();
		}
		Arrays.sort(data);		
		int ans = 0;

		for(int i = N-1;i >= 0;i = i - 2){
			ans += data[i];
		}
		for(int i = N-2;i >= 0;i = i - 2){

			ans -= data[i];
		}
		
		System.out.println(ans);
	}




}
