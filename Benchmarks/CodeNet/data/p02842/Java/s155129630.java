import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(double i=1;i<=n;i++) {
			if(Math.floor(i*1.08) == n) {
				int j = (int)i;
				System.out.println(j);
				System.exit(0);
			}
		}
		System.out.println(":(");
	}

}
