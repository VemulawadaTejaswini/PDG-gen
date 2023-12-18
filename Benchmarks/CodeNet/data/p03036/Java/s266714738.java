import java.util.Scanner;

public class Main {
	
	static long[] maxPas = new long[5];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x_2000 = sc.nextInt();
		
		int prev = x_2000;
		for(int i=0; i<11; i++) {
			if(i==0) {
				System.out.println(x_2000);
			} else {
				int next = r * prev - D;
				System.out.println(next);
				prev = next;
			}
		}
		
	}

}
