import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h =0;
		int count = 0;
		for(int i= 0;i<N; ++i) {
			h = sc.nextInt();
			if( h >= K) {
				count++;
			}
		}
		
		System.out.println(count);

	}
}
