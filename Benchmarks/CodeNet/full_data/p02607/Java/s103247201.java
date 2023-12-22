import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			long[] Square = new long[N];
			for(int i=0;i<N;i++) {
				Square[i] = Integer.parseInt(sc.next());
			}
			long count = 0;
			for(int i=0;i<=N-1;i++) {
				if(i%2==1) {
					if(Square[i]%2==1) {
						count++;
					}
				}
			}
			System.out.println(count);
		}	
	}
}