import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		double p = Math.sqrt(m);
		int max = 0;
		
		for(int i = 1 ; i <= p ; i++) {
			if(m % i == 0) {
				int temp = m /i;
				if(temp >= n) {
					max = i;
				}
			}
		}
		System.out.println(max);
		
	}
	

}
