import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a >=-1000 && a <= 1000) {
				if(b >=-1000 && b <= 1000) {
					
					if(a>b) {
						System.out.println("a > b");									
					}else if(a<b) {
						System.out.println("a < b");									
						
					} else {
						System.out.println("a == b");															
					}
				}
			}
		}
	}
}