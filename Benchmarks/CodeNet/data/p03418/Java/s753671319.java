import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int ans = 0;
		for(int i = 1;i <= N;i++){
			for(int j = 1;j <= N;j++){
				if(i % j >= K ){
					ans++;

				}
			}
		}

		System.out.println(ans);

	}


}
