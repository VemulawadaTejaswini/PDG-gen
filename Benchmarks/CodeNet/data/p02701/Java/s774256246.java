import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[200001];
		int cnt = 1;
		int kaishi = 0;

		for(int i = 0; i<N; i++) {
			S[i] = sc.next();
			if(i > 0) {
				for(int j = kaishi; j<N-(N-1); j++) {
					if(!S[i].equals(S[j])) {						
						cnt = cnt + 1;
						kaishi = i;
					}
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}