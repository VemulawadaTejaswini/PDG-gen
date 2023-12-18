import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int result[] = new int[N-1];
		for (int i=1;i<N;i++) {
			for (int j=i+1;j<=N;j++) {
				if (j<=X||i>=Y) {
					result[j-i-1]++;
				} else {
					int temp = Math.abs(X-i);
					temp +=Math.abs(j-Y)+1;
					if (temp >j-i) {
						temp = j-i;
					}
					result[temp-1]++;
				}
			}
		}
		for (int i=0;i<N-1;i++) {
			System.out.println(result[i]);
		}
	}
}