import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		sb.append(sc.next());
		sc.close();
		sb.setCharAt(3,'8');
		System.out.println(sb.toString());

	}

}
