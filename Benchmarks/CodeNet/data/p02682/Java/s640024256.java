import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		long k = stdIn.nextLong();
		
		if(k<=a) {
			System.out.println(k);
		}else if(k<=a+b){
			System.out.println(a);
		}else {
			System.out.println(a-(1*(k-a-b)));
		}
		
	}

}
