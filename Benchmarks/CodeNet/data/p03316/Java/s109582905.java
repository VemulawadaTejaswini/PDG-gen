import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;
		N = scanner.nextInt();
		int ans = 0;
		while(N > 0){
			ans += N % 10;
			N /= 10;
		}
		
		if (N % ans == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}