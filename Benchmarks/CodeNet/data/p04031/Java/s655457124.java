import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		int total = 0;
		for(int i=0;i<N;i++) {
			a[i] = scanner.nextInt();
			total+=a[i];
		}
		double av = (double)total/(double)N;
		float ave = Math.round(av);
		float cost = 0;
		for(int i=0;i<N;i++) {
			cost+=(a[i]-ave)*(a[i]-ave);
		}
		System.out.println((int)cost);
		scanner.close();
	}

}
