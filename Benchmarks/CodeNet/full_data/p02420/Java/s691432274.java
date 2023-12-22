import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				String str = sc.next();
				if (str.equals("-"))	break;
				
				int m = sc.nextInt();
				for(int i=0; i<m; i++) {
					int h = sc.nextInt();
					
					String s = str.substring(h,str.length()) + str.substring(0,h);
					str = s;
			//		System.out.println(str);
				}
				System.out.println(str);
			}
			
			
			
		}
	}
}
