import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] id = new String[n];
		int open = 0;
		for(int i=0;i<n;i++) {
			id[i] = sc.next();
		}
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			String q = sc.next();
			boolean flag = false;
			for(int j=0;j<n;j++) {
				if (q.equals(id[j])) {
					if (open==0) {
						System.out.println("Opened by " + q);
					}else{
						System.out.println("Closed by " + q);
					}
					open = 1 - open;
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Unknown " + q);
			}
		}
	}

}