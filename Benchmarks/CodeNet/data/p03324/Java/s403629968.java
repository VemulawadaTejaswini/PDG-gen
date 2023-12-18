import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt();
		int N = scan.nextInt();
		scan.close();
		if(D == 0) {
			System.out.println(N);
		}else if(D == 1){
			System.out.println(N * 100);
		}else {
			System.out.println(N * 10000);
		}
	}
}