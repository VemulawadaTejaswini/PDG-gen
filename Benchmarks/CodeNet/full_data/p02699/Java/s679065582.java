import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sheep = Integer.parseInt(sc.next());
		int walf = Integer.parseInt(sc.next());
		String result =sheep > walf?"safe":"unsafe";
		System.out.println(result);

	}

}
