import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int[] s = new int[n];
		for(int i = 0 ; i < n ; i++) {
			s[i] = -1;


		}

		int ans = 0;
		for(int i = 0 ; i < m ; i++) {
			int temp1 = Integer.parseInt(sc.next()) -1;
			int temp2 = Integer.parseInt(sc.next());

			if(s[temp1] == -1) {
				s[temp1] = temp2;
			}else if(s[temp1] != temp2) {
				ans = -1;
				break;
			}

		}


		for(int i = 0 ; i < n ; i++) {
			if(s[i] == -1) {
				if(i == 0 || n == 1) {
					s[i] = 1;
				}else {
					s[i] = 0;
				}
			}
		}

		if(n != 1 && s[0] == 0) {
			ans = -1;
		}

		if(ans != -1) {
			String tmp = "";
			for(int i = 0 ; i < n ; i++ ) {
				tmp += "" + s[i];
			}
			
			ans = Integer.parseInt(tmp);
		}	

		System.out.println(ans);
	}
}