import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N-i; j++) {	
				int k = N - i - j;
				if (10000 * i + 5000 * j + 1000 * k == Y && i+j+k == N) {
					System.out.println(i + " " + j + " " + k); 	
					System.exit(0);
				}	
			}	
		}
		System.out.println("-1 " +  "-1 " + "-1");
	}
}