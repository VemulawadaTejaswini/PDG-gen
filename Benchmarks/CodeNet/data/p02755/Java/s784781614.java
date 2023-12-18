import java.util.Scanner;

public class Main {


	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = 0;
		boolean istax = false;
		int i = 1;
		for (; i < 1009 ; i++) {
			int x8 = (int)(i * 0.08);
			int x10 =(int)(i* 0.1);
			if(x8 == a && x10 == b) {
				istax = true;
				break;
			}
		}

		System.out.println(istax ? i : -1);

	}

}
