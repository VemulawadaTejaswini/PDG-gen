import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int x = sc.nextInt();
		
		if(x==1 || x==2*N-1) {
			pw.println("No");
		} else {
			pw.println("Yes");
			for(int i=0; i<2*N-1; i++)
				pw.println((i+x-N+2*N-1)%(2*N-1)+1);
		}
		sc.close();
		pw.close();
	}
}
