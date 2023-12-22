import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int n = stdIn.nextInt();

			double div = 1.0*a/b;
			int sum = 0;
			int tmp;
			for(int i=0;i<n;i++){
				tmp = (int) div;
				div*=10;
				div -= tmp * 10;
				sum+=div;
			}
			System.out.println(sum);
		}
	}
}