import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		sc.close();

		int link = (N*(N-1))/2;

		int count = 0;
		if(K > N){
			System.out.println(-1);
		}
		else{
			System.out.println(link - K);
			outside:
			for(int i = 1 ; i <= N-1 ;i++){
				for(int j = i+1 ; j <= N ; j++){
					if(count == link-K){
						break outside;
					}
					System.out.println(i + " " + j);
					count ++;
				}
			}
		}
	}
}
