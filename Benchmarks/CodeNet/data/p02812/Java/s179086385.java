import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String a = sc.next();
		int cnt = 0;

		for(int i=0;i<N;i++) {
			if(a.charAt(i)== 'A') {
				if(a.charAt(i+1)=='B') {
					if(a.charAt(i+2)=='C') {
						cnt++;
					}
				}

			}
		}
		System.out.println(cnt);
	}

}
