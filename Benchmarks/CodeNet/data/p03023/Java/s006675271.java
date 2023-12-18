import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			System.out.println(180*(N - 2));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}