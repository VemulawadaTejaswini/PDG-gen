import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = 1868 * 365 + 9 * 12 + 8;
		int d2 = 1912 * 365 + 7 * 12 + 30;
		int d3 = 1926 * 365 + 12 * 12 + 25;
		int d4 = 1989 * 365 + 12 * 1 + 8;
		while(sc.hasNext()) {
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			int t = y * 365 + m * 12 + d;
			if(t < d1) {
				System.out.println("pre-meiji");
			}else if(t < d2) {
				System.out.print("meiji ");
				System.out.printf("%d %d %d\n", y - 1867, m, d);
			}else if(t < d3) {
				System.out.print("taisho ");
				System.out.printf("%d %d %d\n", y - 1911, m, d);
			}else if(t < d4){
				System.out.print("showa ");
				System.out.printf("%d %d %d\n", y - 1925, m, d);
			}else {
				System.out.print("heisei ");
				System.out.printf("%d %d %d\n", y - 1988, m, d);
			}
		}
	}
}

