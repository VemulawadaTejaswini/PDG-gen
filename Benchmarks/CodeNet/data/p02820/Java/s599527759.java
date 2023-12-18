import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		int sum = 0;
		String t = sc.next();

		for (int i = 0; i < k; i++) {
			char l = 0;
			for (int j = i; j < n; j += k) {
				if(t.charAt(j) != l) {
					if(t.charAt(j) == 'r') {
						sum += p;
						l = 'r';
					}else if(t.charAt(j) == 's'){
						sum += r;
						l = 's';
					}else {
						sum += s;
						l = 'p';
					}
				}else {
					l = 0;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}