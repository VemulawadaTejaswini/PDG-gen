import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		if((a - b) % 2 == 0 ) {
			System.out.println(Math.abs(a -b)/2);
		}else {
			int temp1 = Math.max(a -1, b - 1);
			int temp2 = Math.max(n - a , n - b);
			System.out.println(Math.min(temp1,temp2));
			
		}
		

	}

}