import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		new Main().run();
		
	}

	Scanner scanner = new Scanner(System.in);
	int n;
	int q;
	String[] en;
	int[] eby;
	int[] wy;
	
	private void run() {
		
		for(;nq();) {
			
			en = new String[n];
			eby = new int[n];
			wy = new int[n];
			
			for (int i = 0; i < wy.length; i++) {
				
				en[i] = scanner.next();
				eby[i] = scanner.nextInt();
				wy[i] = scanner.nextInt();
				
			}
			
			for (int i = 0; i < q; i++) {
				
				int qry = scanner.nextInt();
				int ip = Arrays.binarySearch(wy, qry);
				
				if (ip < 0) {
					
					ip = - ip - 1;
					
				}
				
				qry = qry - wy[ip] + eby[ip];
				
				if (qry > 0) {
					
					System.out.println(en[ip] + " " + qry);
					
				} else {
					
					System.out.println("Unknown");
					
				}
			}
		}
		
	}

	private boolean nq() {
		
		n = scanner.nextInt();
		q = scanner.nextInt();
		
		return (n | q) != 0;
		
	}

}