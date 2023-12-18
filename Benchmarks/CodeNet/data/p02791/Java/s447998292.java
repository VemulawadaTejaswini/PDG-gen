
import java.util.Scanner;


public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int min = n+1;
		for (int i=0;i<n;i++) {
			int p = sc.nextInt();
			if (p<min) {
				count++;
				min=p;
			}
		}
		System.out.println(count);
	}

}