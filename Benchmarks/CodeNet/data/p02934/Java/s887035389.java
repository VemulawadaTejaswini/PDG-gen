import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        double ans = 0;
	        double A = 0;
	        double A1 = 0;
			
			for (int i=0; i<N; i++){
				A1 = sc.nextDouble();
				A += (1 / A1);
			}
			
			ans = 1/A;
			
			System.out.println(ans);
	}
}