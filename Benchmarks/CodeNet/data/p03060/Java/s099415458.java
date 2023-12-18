import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] v_list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] c_list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] x_y_data = new int[N];
		int result=0;
		
		for(int i=0;i<N;i++) {
			if(v_list[i]-c_list[i]>0) {
				result += v_list[i]-c_list[i];
			}
		}
		System.out.println(result);
	}
}
