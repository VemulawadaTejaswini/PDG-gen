import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			String str = scan.next();
			
			boolean two = false;
			boolean three = false;
			
			
			String[] s = str.split("");
			Set<String> set = new HashSet<>();
			
			for(int i=0; i<N-1;i++) {
				String a = s[i]+s[i+1];
				if(set.contains(a)) {
					two=true;
					break;
				} else {
					set.add(a);
				}
			}
			
			int max=N/2;
			
			for(int i = max; i > 2; i--) {
				for(int j=0; j< N-i;j++) {
					String a = str.substring(j, j+i);
					if(str.matches(".*"+ a +".*" + a +".*")) {
						System.out.println(i);
						return;
					}
				}
			}
			if(two) {
				System.out.println(2);
				return;
			}
			System.out.println(0);
		}
	}
}