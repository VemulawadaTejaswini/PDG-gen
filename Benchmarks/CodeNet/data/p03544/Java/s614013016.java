import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		BigDecimal l[] = new BigDecimal[88];
		l[0] = new BigDecimal(2);
		l[1] = new BigDecimal(1);
		int x = 0;
		
		for (int i = 0; i < n; i++){
			l[i+2] = l[i].add(l[i+1]);
		}
		
		System.out.println(l[n]);
		
		
		
	}

}
