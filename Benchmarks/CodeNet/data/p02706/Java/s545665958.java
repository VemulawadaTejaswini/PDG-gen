import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int no = 0;
		int scan = 0;
		while(no>=m) {
			scan = scanner.nextInt();
			n = n - scan;
			no++;
		}
		if(m<-1) {
			m = -1;
		}
	}
}

