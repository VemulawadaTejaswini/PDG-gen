import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
//		String S = sc.next();

		if(A == 0) {
			System.out.println(0);
			return;
		}

		StringBuilder sb = new StringBuilder();
		double aa = N <= Math.pow(10, 100) ? N: Math.pow(10, 100);
		boolean bb = true;
		int count = 0;

		for(int i=1; i <= aa;i++) {
			if(bb) {
				sb.append("b");
				count++;
			} else {
				count++;
			}
			if(bb && count == A) {
				bb =false;
				count = 0;
			} else if(!bb && count == B) {
				bb =true;
				count = 0;

			}
		}

		System.out.println(sb.toString().length());

	}
}
