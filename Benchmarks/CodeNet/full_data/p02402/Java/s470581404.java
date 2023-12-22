import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int min = 1000000,max = -1000000;
		long total = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n ; i++) {
			int x = sc.nextInt();
			if(x < min)min = x;
			if(max < x)max = x;
			total = total + x;
		}
		System.out.println(String.format("%d %d %d",min,max,total));
	}
}
