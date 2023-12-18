import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = 1;
		for(int i = 0;i < N; i++){
			x = x * (i+1);
		}
		double y = Math.pow(10, 9);
		System.out.print(""+ (x%(y + 7)));
	}

}
