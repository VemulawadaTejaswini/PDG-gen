import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		sc.close();
		
		int numOfOdd = 0;
		if(n %2 == 1) {
			numOfOdd = n / 2 + 1;
		}else {
			numOfOdd =  n / 2;
		}
		
		System.out.println((double)numOfOdd / n);
	}
}