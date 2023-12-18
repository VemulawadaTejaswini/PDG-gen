import java.util.Scanner;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Nm = N-1;
		int[] H = new int[N];

		for(int i = 0;i < N;i++) {
		H[i] = Integer.parseInt(sc.next());
		}

		for(int j = 0; j < Nm; j++) {
			for(int k = j; k < Nm; k++) {
				if(H[k] >= H[k+1]) {
					count++;
				}else break;
			}
			if(count2 < count) {
				count2 = count;
			}
			count = 0;
		}
		PrintWriter out = new PrintWriter(System.out);
		    out.println(count2);
		out.flush();
	}
}