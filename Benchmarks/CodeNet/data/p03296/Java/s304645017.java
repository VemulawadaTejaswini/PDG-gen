import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int now = -1;
		int count =0;
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			if (now==temp) {
				now =-1;
				count ++;
			} else {
				now = temp;
			}
		}
		System.out.println(count);
	}
}