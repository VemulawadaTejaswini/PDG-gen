import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int count = 0;
		Scanner std = new Scanner(System.in);
		int N = std.nextInt();
		int M = std.nextInt();
		int K = std.nextInt();

		ArrayList<Long> n_m = new ArrayList<Long>();
		for(int i = 0; i < N + M; i++)
			n_m.add(std.nextLong());

		Collections.sort(n_m);

		int i = 0;
		while(K > 0){
			if(K - n_m.get(i) >= 0){
				K -= n_m.get(i);
				count++;
			}else{
				K -= n_m.get(i);
			}
		}

		System.out.println(count);
	}

}
