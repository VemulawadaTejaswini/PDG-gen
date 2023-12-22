import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int max = 0;
			int min = 1000;
			int ten = 0;
			for(int i=0; i<n; i++) {
				int s = sc.nextInt();
				ten += s;
				if(s > max) {
					max = s;
				} else if(s < min) {
					min = s;
				}
			}
			ten = (ten - max - min) / (n - 2);
			System.out.println(ten);
		}
		sc.close();
	}
}