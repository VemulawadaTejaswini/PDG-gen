import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int d = sc.nextInt();
			int area = 0;
			for(int x=0;x<600;x+=d) {
				area += x * x * d;
			}
			System.out.println(area);
		}
	}

}