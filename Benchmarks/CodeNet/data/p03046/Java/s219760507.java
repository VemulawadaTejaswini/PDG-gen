
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt();
		long K=sc.nextLong();
		if(K!=0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		for(long i=0; i<=M; i++) {
			if(i!=0) System.out.print(" ");
			System.out.print(i);
			System.out.print(" "+i);
		}
		System.out.println();
		sc.close();
	}
}
