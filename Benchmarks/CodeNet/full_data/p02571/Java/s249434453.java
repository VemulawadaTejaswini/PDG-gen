import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		String T = sc.nextLine();
		//int T = sc.nextInt();
		int ans = T.length();

		for(int start = 0; start <= S.length() - T.length(); start++) {
			int diff = 0;
			for(int i = 0; i<T.length();i++) {
				if(T.charAt(i) != S.charAt(start+i)) {
					diff++;
				}
			}
			ans = min(ans , diff);
		}

		System.out.print(ans);

    }

	static int min(int x,int y) {
		if(x>y) {
		return y;
		}
		else if(x<y) {
			return x;
		}
		else
			return x;
	}
}



//cabacc
//abc