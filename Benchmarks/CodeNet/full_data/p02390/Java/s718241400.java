import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,m,h;
		System.out.println("秒数を入れてください。S:");
		s = sc.nextInt();

		h = s / 3600;
		m = (s%3600) / 60;
		s = s % 60;

		System.out.println(h + ":" + m + ":" + s);
	}

}

