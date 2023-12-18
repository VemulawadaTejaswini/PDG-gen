import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		long N = 2*n-1;
		if(x == n){
			System.out.println("Yes");
			for(long i = 1;i <= N;i++){
				System.out.println(i);
			}
		}else{
			System.out.println("No");
		}
	}
}