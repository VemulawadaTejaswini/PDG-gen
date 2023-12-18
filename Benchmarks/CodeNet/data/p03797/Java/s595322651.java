import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(),m = scanner.nextLong();
		if(n > m * 2){
			System.out.println(n);
		}else{
			long piece = n;
			m -= m * 2;
			System.out.println(n + (m / 4));
		}
	}

}
