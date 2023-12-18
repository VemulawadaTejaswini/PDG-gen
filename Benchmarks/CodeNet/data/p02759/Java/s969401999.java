import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		if(n%2!=0) {
			result = (n/2)+1;
		}else {
			result = n/2;
		}
		System.out.println(result);
	}

}
