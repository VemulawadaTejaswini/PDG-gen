import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int max = 0;
		for(int i = 1;i <= Math.sqrt(N);i++){
			max = Math.max(max, floor(A*i/B)-A*floor(i/B));
		}
		System.out.println(max);
	}

	public static int floor(int x){
		return x;
	}

}