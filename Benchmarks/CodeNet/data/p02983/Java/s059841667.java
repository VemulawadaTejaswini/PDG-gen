import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int L = sc.nextInt();
			int R = sc.nextInt();
			int n = R-L+1;
			int[] m = new int[n];
			
			
			for(int i=L;i<=R;i++) {
				m[i-L] = i%2019;
			}
			
			Arrays.sort(m);
			
			System.out.println(m[0]*m[1]);
			
		}
		
	}
