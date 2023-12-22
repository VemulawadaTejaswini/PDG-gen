
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String qwright = "nmhjklyuiop" ;
			
			while(true) {
				int cnt = 0;
				String str = sc.next();
				char[] input = str.toCharArray();
				if(str.equals("#"))	break;
				int[] left = new int[input.length];
				for(int i=0; i<input.length; i++) {
					if(qwright.indexOf(input[i]) != -1) {
						left[i] = 1;
					}else {
						left[i] = 0;
					}
					if(i != 0) {
						if(left[i] != left[i-1]) {
							cnt++;
						}
					}
				}
				System.out.println(cnt);
			}
			
			
			
		}
	}
}


