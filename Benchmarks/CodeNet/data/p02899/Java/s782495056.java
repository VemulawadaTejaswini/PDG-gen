
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();

		List<Integer> list = new ArrayList<Integer>(N);

		int hi = 0;

		for (int i=0; i<N; i++) {
		   hi =	scan.nextInt();
		   list.add(hi);
		}


		int cnt = 0;

		for(int j=1; j<=N; j++) {

			cnt =  1 + list.indexOf(j);
			String ans = String.valueOf(cnt);
			StringBuilder sb = new StringBuilder(ans);
			sb.append(" ");
			System.out.print(sb);

		}

	}
}

