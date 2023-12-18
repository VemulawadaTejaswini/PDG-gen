import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float N = sc.nextInt();
		float K = sc.nextInt();
		float count = 1;
		while (N >= K) {
			N = N / K;
			count++;
		}
		System.out.println(count);
		return ;
	}
}