import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int N = Integer.parseInt(n);
		int[] w_list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] data_wa = new int[N];
		
		data_wa[0] =  w_list[0];
		for(int i=1;i<N;i++) {
			data_wa[i] = data_wa[i-1] + w_list[i];
		}
		
		int min_value= Math.abs(data_wa[N-1] - data_wa[0]);
		
		for(int i=1;i<N-1;i++) {
			int S1 = data_wa[i];
			int S2 = data_wa[N-1] - data_wa[i];
			if(Math.abs(S1 - S2) < min_value) min_value = Math.abs(S1 - S2);
		}
		System.out.print(min_value);
	}
}
