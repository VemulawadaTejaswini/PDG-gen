import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int s500 = X/500;
		int s5 = (X%500)/5;
		int uresi = s500*1000 + s5*5;
		System.out.println(uresi);
	}

}