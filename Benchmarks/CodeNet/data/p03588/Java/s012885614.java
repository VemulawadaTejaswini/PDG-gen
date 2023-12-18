import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int min = Integer.MAX_VALUE;
		
		int chk = 0;
		int idx = 0;
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			if(chk < a) {
				chk = a;
				idx = b;
			}
			
			
			map.put(a,b);
			
		}
		
		System.out.println(chk+idx);
		
	}

}
