import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long ytotal = scanner.nextInt();
		long xtotal = scanner.nextInt();
		if(ytotal <= 0 || xtotal <=0) {
			System.out.println(0);
		}
		
		if(ytotal ==1 || xtotal ==1) {
			System.out.println(1);
		}
		if((ytotal*xtotal)%2==1) {
			System.out.println((ytotal*xtotal)/2+1);
		}else {
			System.out.println((ytotal*xtotal)/2);
		}

	}
			
}