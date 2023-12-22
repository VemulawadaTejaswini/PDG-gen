import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		final int q = sc.nextInt();
		
		for(int i = 0; i < q; i++){
			final String ops = sc.next();
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			//System.out.println(input);
			
			if("replace".equals(ops)){
				final String rep = sc.next();
				input = input.substring(0, a) + rep + input.substring(b + 1);
			}else if("reverse".equals(ops)){
				StringBuilder sb = new StringBuilder(input.substring(a, b + 1));
				input = input.substring(0, a) + sb.reverse() + input.substring(b + 1);
			}else if("print".equals(ops)){
				System.out.println(input.substring(a, b + 1));
			}
		}
		
		
	}
}