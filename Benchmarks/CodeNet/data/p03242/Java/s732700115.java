import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n / 100 == 1) {
			n += 800;
		}else if(n / 100 == 9) {
			n -= 800;
		}
			
		if((n % 100)/10 == 1) {
			n += 80;
		}else if((n % 100)/10 == 9) {
			n -= 80;
		}
		
		if(n % 10 == 1) {
			n += 8;
		}else if(n % 10 == 9) {
			n -= 8;
		}
		
		System.out.println(n);
	}
}
