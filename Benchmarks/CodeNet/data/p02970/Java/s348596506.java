import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		scan.close();

		int res = 2*D+1;
		
		if(N%res>0) {
			res++;
		}
		System.out.println(res);
	}

}