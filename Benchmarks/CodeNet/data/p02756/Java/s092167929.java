import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();

		StringBuffer sb = new StringBuffer(S);

		for (int i=0; i<Q; i++){
			int T = sc.nextInt();
			if (T == 1){
				sb.reverse();
			} else if (T == 2){
				int F = sc.nextInt();
				String C = sc.next();
				if (F == 1) {
					sb.insert(0, C);
				} else if (F == 2) {
					sb.append(C);
				}
			}
		}
		System.out.println(sb.toString());
	}
}