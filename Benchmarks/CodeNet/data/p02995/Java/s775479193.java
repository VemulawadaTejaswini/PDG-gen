import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();
		long count = 0;
		for(long i=A;i<=B;i++) {
			if(i%C!=0) {
				if(i%D!=0) {
					count++;
					System.out.println(count);
				}
			}
		}
		System.out.println(count);

	}

}
