import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int d=sc.nextInt();
			int n=sc.nextInt();
			if(d==0) {
				if(n<100) {
					System.out.println(n);
				}
				else {
					System.out.println(n+n/100);
				}
			}
			else if(d==1) {
				if(n<100) {
					System.out.println(100*n);
				}
				else {
					System.out.println((100+n/100)*n);
				}
			}
			else if(d==2) {
				if(n<100) {
					System.out.println(10000*n);
				}
				else {
					System.out.println((100+n/100)*100*n);
				}
			}
		}
	}
}