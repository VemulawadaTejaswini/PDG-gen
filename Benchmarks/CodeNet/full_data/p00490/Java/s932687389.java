import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int tcal = c;
		int cnt = 0;
		int d[] = new int[100];
		for(int i = 0; i < n; i++){
			d[i] = in.nextInt();
			if((c / a * 2) < d[i] / b){
				tcal += d[i];
				cnt++;
			}
		}
		System.out.println(tcal / (a + (cnt * b)));
	}
}