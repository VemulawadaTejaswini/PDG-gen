import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int g = sc.nextInt();
		int p = sc.nextInt();
		long count=0;

		if(m-n<p ||k-m<p ||l-k<p ||g-l<p) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
	}
}


