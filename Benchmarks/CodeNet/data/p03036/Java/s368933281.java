import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		long xi = sc.nextLong();
		long x;
		for(int i=0; i<10; i++){
			x=r*xi-d;
			System.out.println(x);
			xi = x;
		}
	}

}
