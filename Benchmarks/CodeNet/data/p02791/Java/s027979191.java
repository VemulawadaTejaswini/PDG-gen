import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p[] = new int[n];

		int num = 1;
		int max = 0;
		for(int i = 0; i < n; i++) {
			p[i] = scan.nextInt();
			if(i != 0) {
				if(p[i] < p[i-1]) {
					num++;
					max = p[i];
				}
			} else {
				max = p[i];
			}
		}
		
		System.out.println(num);
	}
}