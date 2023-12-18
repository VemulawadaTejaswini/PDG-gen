import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			
			long K = scan.nextLong();
			
			
			if(S.substring(0, 1).equals("1")) {
				if(K==1) System.out.println("1");
				else System.out.println(S.substring(1, 2));
			}else{
				System.out.println(S.substring(0, 1));
			}
			
			
			
		}
	}
}
