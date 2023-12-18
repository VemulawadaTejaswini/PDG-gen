import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			String str = scan.next();
			
			
			int max=N/2;
			
			for(int i = max; i > 1; i--) {
				for(int j=0; j< N-i;j++) {
					String a = str.substring(j, j+i);
					if(str.indexOf(a, j+i-1) > 0) {
						System.out.println(i);
						return;
					}
				}
			}
			
				System.out.println(0);
				return;
			
		}
	}
}