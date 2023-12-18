import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		int maxnum = Math.max(a, Math.max(b, c));
		int maxX = maxnum;
		
		for(int i =0; i<k ; i++) {
			maxX*=2;
		}
		
		System.out.println(a+b+c-maxnum+maxX);
	}

}