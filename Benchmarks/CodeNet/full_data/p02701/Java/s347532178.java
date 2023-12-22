import java.util.HashSet;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			HashSet<String> h = new HashSet<String>();
			
			for(int i=0;i<n;i++) {
				h.add(sc.next());
			}

			System.out.println(h.size());
	    }
				
	}
