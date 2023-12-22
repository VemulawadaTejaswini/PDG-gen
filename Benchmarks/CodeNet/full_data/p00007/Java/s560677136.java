import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double debt = 10;
		int N = in.nextInt();
		for(int i=0;i<N;i++){
			debt = Math.ceil(debt*1.05*10)/10;
		}
		System.out.printf("%.0f",debt*10000);
	}
}