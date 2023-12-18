import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < N; j ++) {
				for(int k = 0; k < N; k ++) {
					if(i < j && j < k) {
						if(!S.substring(i, i + 1).equals(S.substring(j, j + 1))) {
							if(!S.substring(i, i + 1).equals(S.substring(k, k + 1))) {
								if(!S.substring(j, j + 1).equals(S.substring(k, k + 1))) {
									if((j - i) != (k - j)) {
										sum ++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}