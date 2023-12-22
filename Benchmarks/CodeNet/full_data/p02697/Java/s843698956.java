
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int [][]p = new int [k][2];
		
		int r = 1;
		int l = n;
		
		for(int i = 0 ; i < k ;i++) {
			p[i][0] = r;
			p[i][1] = l;
			r++; l--;
		}
		
		for(int i = 0 ;i < k ;i++) {
			System.out.println(p[i][0]+" "+p[i][1]);
		}

	}
}
