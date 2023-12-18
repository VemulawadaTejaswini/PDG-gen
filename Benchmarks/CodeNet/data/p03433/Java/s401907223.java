import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		String result = "No";
		if(n%500<a) result = "Yes";
		System.out.println(result);
	}

}
