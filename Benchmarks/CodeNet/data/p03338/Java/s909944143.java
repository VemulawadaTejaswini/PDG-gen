import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		int count = Integer.MIN_VALUE;
		String check = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 1; i < N; i++) {
			int tmpCount = 0;
			String X = S.substring(0, i);
			String Y = S.substring(i, N);
			for(int j = 0; j < check.length(); j++) {
				if(X.contains(check.substring(j, j + 1))) {
					if(Y.contains(check.substring(j, j + 1))){
						tmpCount++;
					}
				}
			}
			count = Math.max(count, tmpCount);
		}
		System.out.println(count);
	}

}
