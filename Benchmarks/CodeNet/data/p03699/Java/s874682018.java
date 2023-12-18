import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		long sum = 0;

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}

		if(sum % 10 == 0) {
			System.out.print(0);
		}else{
			System.out.print(sum);
		}

	}
}