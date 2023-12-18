import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		for(int i=0;i<=1000;i++) {
			int a = (int)Math.pow(i, 5);
			for(int j=-1000;j<=1000;j++) {
				int b = (int)Math.pow(j, 5);
				if(a - b == x) {
					System.out.println(a+" "+b);
					System.exit(0);
				}
			}
		}

	}

}
