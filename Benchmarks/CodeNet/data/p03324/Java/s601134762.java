import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int result = 100 * d;
		
		if(result == 0){
			System.out.println(n);
		}else{
			System.out.println(result * n);
		}

	}
}
