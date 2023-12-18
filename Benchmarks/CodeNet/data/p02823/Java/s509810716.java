import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());
		Long a = Long.parseLong(sc.next());
		Long b = Long.parseLong(sc.next());
		
		if((a - b) % 2 == 0 ) {
			System.out.println(Math.abs(a -b)/2);
		}else {
			Long temp1 = Math.max(a -1, b - 1);
			Long temp2 = Math.max(n - a , n - b);
			System.out.println(Math.min(temp1,temp2));
			
		}
		

	}

}