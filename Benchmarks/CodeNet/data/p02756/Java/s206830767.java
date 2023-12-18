import java.util.Scanner;


class Q {
	int t;
	int f;
	String addString;
}

public class Main {


//	final int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

//		int n = sc.nextInt();
		String s = sc.next();
		int q = sc.nextInt();
		Q[] query = new Q[q];
		String frontString = "";
		String backString = "";

		for(int i = 0; i < q; i++) {
			query[i] = new Q();
			query[i].t = sc.nextInt();
			if(query[i].t == 2) {
				query[i].f = sc.nextInt();
				query[i].addString = sc.next();
			}

			if(query[i].t == 1) {
				StringBuffer str = new StringBuffer(s);
		        s = str.reverse().toString();
			} else {
				if(!f) {
					if(query[i].f == 1) {
						s = query[i].addString + s;
					} else {
						s = s + query[i].addString;
					}
				} else {
					if(query[i].f == 2) {
						s = query[i].addString + s;
					} else {
						s = s + query[i].addString;
					}
				}
			}

//			System.err.println(frontString + s + backString);
		}

		//-------------------------------------------------------------------------------------


		System.out.println(frontString + s + backString);

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}
}