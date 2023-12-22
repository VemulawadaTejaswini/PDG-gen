import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int N = sc.nextInt();
				int M = sc.nextInt();
				int P = sc.nextInt();
				if(N + M + P == 0) break;
				
				int w = 0;
				int sum = 0;
				boolean win = true;
				for(int i=1; i<N; i++) {
					int X = sc.nextInt();
					if(i == M) {
						if(x == 0) win = false;
						else  w = X;
					}
					sum += X * 100;
				}
				if(!win) System.out.println(0);
				else {
					sum = sum * (100 - P) / 100;
					System.out.println(sum / w);
				}
			}
		}
	}
}
