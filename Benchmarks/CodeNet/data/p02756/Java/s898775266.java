import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(sc.next());
		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			if(sc.nextInt() == 1) {
				sb.reverse();
			}else {
				if(sc.nextInt() == 1) {
					sb.insert(0, sc.next());
				}else {
					sb.append(sc.next());
				}
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
