import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int count = 0;
		long[][] arr = new long[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0] = scan.nextLong();
			arr[i][1] = scan.nextLong();
		}
		scan.close();

		for(int i=0;i<n;i++) {
			if(Math.sqrt((arr[i][0])*(arr[i][0])+(arr[i][1])*(arr[i][1])) <= d) {
				count++;
			}
		}
		System.out.println(count);
	}
}
