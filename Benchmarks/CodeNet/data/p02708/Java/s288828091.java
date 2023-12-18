import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	long sum = 0;
	int N = scan.nextInt();
	int K = scan.nextInt();
	
	for(int x = K; x != N+2; x++) { //N+1回ルーピュ
		int j = N;
		long min = 0;
		long max = 0;
		for(int i = 0; i != x; i++) {
			min += i;
			max += j;
			j--;
		}
		sum = sum + (max - (min-1));
	}
	System.out.println(sum);
	
	}

}
