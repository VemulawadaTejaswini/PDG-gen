import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double xa1 = sc.nextDouble();
			double ya1 = sc.nextDouble();
			double xa2 = sc.nextDouble();
			double ya2 = sc.nextDouble();
			double xb1 = sc.nextDouble();
			double yb1 = sc.nextDouble();
			double xb2 = sc.nextDouble();
			double yb2 = sc.nextDouble();
			if(xb2 < xa1 || xa2 < xb1 || yb2 < ya1 || ya2 < yb1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
