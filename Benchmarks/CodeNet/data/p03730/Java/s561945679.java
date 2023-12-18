import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ct = 0;
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		for(int i = A; i <= A * B; i++) {
			if(i % B == C) {
				ct++;
			}
		}
		if(ct == 0) System.out.println("NO");
		else System.out.println("YES");
		scan.close();
	}
}
