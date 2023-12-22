import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				int m = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();
				
				if(m == -1 && f == -1 && r == -1) break;
				
				if(m == -1 || f == -1) {
					sb.append("F\n");
					continue;
				}
				
				int total = m + f;
				
				if(80 <= total) {
					sb.append("A\n");
					continue;
				}
				if(65 <= total && total < 80) {
					sb.append("B\n");
					continue;
				}
				if(50 <= total && total < 65) {
					sb.append("C\n");
					continue;
				}
				if(30 <= total && total < 50) {
					if(50 <= r) {
						sb.append("C\n");
					} else {
						sb.append("D\n");
					}
					continue;
				}
				if(total < 30) {
					sb.append("F\n");
				}
			}
			
			System.out.print(sb.toString());
		}
	}
}
