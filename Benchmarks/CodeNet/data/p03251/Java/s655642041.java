import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),X=sc.nextInt(),Y=sc.nextInt();
		int xmax = 1;
		for(int i=0; i<N; i++) {
			int n = sc.nextInt();
			if(xmax < n) xmax = n;
		}
		int ymin = 100;
		for(int i=0; i<M; i++) {
			int n = sc.nextInt();
			if(ymin > n) ymin = n;
		}

		for(int z=X+1; z<=Y; z++) {
			if(xmax < z && ymin >= z) {
				System.out.println("No War");
				return;
			}
		}
		System.out.println("War");
	}
}
