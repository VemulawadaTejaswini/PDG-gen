import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
				int N = scan.nextInt();
				int K = scan.nextInt();

				if(N < K){
					System.out.println(1);
				}
				int ans = N%K;
				
				System.out.println(ans);
	
	}







}