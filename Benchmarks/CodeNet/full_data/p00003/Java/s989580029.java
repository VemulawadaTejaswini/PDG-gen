import java.util.*;

public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < N; i++) {
			String[] input = sc.nextLine().split(" ");
			
			long[] array = {
					Integer.parseInt(input[0]),
					Integer.parseInt(input[1]),
					Integer.parseInt(input[2])
					};
			
			Arrays.sort(array);
			
			if ((array[0]^2 + array[1]^2) == (array[2]^2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}		
	}
}