import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String P = sc.nextLine();
		String[] PA = P.split(" ");
		int zure = 0;
		
		for(int i=1; i<=Integer.parseInt(N); i++) {
			if(Integer.parseInt(PA[i - 1]) != i) {
				zure++;
			}
		}
		
		if(zure <= 2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}