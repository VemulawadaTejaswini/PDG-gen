import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = (long) Math.floor(sc.nextDouble() * 100);
		System.out.println(a * b / 100);
		
		sc.close();
	}
	
}

