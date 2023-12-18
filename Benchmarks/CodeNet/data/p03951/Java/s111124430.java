import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char s[] = sc.next().toCharArray();
		char t[] = sc.next().toCharArray();

		int ans = N * 2;
		int start = -1;
		int count = 0;
		int flag = 0;
		int flag_2 = 0;
		char c = '-';


		for (int i = 0; i < N; i++) {
			if(s[i]!=t[i]) {
				flag_2 = 1;
			}
		}

		if (flag_2 == 0){
			System.out.println(N);
			System.exit(0);
		}

		for (int i = 0; i < N; i++) {
//			System.out.print(s[N-1] + ",");
//			System.out.println(t[i]);
			if (s[N-1] == t[i]) {
				start = i;
				c = t[i];
				break;
			}
		}

//		System.out.println(start);

		if (start == -1) {
			System.out.println(ans);
			System.exit(0);
		}

		if (start == 0){

			for (int i = 1;i < N ;i++) {

//				System.out.print(s[N-1-i] + ",");
//				System.out.println(t[i-1]);
				if (s[N-1-i] == t[i] && t[i-1] == c ) {


					count++;
				}
			}

			ans = ans -1 - count;
			System.out.println(ans);
			System.exit(0);
		}

		int a = 1;
		for (int k = start -1; k >=0 ; k--) {
			a = a+1;
//			System.out.print(s[N-a] + ",");
//			System.out.println(t[k]);

			if (s[N-a] == t[k]) {

				count = count + 1;
			} else{
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println(N*2);
			System.exit(0);
		}

		System.out.println(ans - count -1);


		sc.close();
	}


}
