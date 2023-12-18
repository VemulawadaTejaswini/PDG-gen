import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		in[0] = in[0] == 1 ? 14 : in[0];
		in[1] = in[1] == 1 ? 14 : in[1];
				
		String res = (in[0] > in[1]) ? "Alice" : in[0] < in[1] ? "Bob" : "Draw"; 
		
		System.out.println(res);		
	}
}
