import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] s = new int[N];

		for(int i=0;i<N;i++) {

			s[i] = sc.nextInt();
		}

		int i = 0;

		int ans = 0;

		while(i<N-1) {

			if(s[i] == s[i+1]) {

				ans++;

				i+=2;

			}else {
				i++;
			}

		}

		System.out.println(ans);
	}

}
