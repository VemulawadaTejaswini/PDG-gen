import java.util.Scanner;

public class Main {

	void	 solve() {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(s.replaceAll("0","").length());
	}
	public static void main(String[] args) throws Exception{
		new Main().solve();
	}
}