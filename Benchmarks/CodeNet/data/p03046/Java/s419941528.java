
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int k = sc.nextInt();
	
		if (m==0) {
			if (k==0) {
				System.out.println("0 0");
			} else {
				System.out.println(-1);
			}
		} else if (m==1) {
			if (k==0) {
				System.out.println("0 0 1 1");
			} else {
				System.out.println(-1);
			}
		} else {
			if (k==0) {
				StringBuilder builder = new StringBuilder();
				for (int i=0;i<(1<<m);i++) {
					builder.append(i);
					if (i<(1<<m)-1) {
						builder.append(" ");
					}
				}
				System.out.println(builder);
				
			} else if (k<(1<<m)) {
				StringBuilder builder = new StringBuilder("0");
				builder.append(" "+k);
				builder.append(" 0");
				for (int i=1;i<(1<<m);i++) {
					if (i!=k) {
						builder.append(" ");
						builder.append(i);
					}
				}
				
				builder.append(" "+k);
				
				for (int i=(1<<m)-1;i>=1;i--) {
					if (i!=k) {
						builder.append(" ");
						builder.append(i);
					}
				}
				
				System.out.println(builder);
			} else {
				System.out.println(-1);
			}
		}
	}
}
