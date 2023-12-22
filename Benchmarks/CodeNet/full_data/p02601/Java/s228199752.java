class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		boolean flag = main.calculate (A,B,C,K,0,false);

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();;

	}

	boolean calculate (int A, int B, int C, int K, int count, boolean flag) {

		if (K==count) {
			if (B>A&&C>B) {
				flag = true;
				return flag;
			} else {
				return flag;
			}
		}

		if (flag) {
			return flag;
		}

		flag = calculate (2*A, B, C, K, count+1, flag);
		flag = calculate (A, 2*B, C, K, count+1, flag);
		flag = calculate (A, B, 2*C, K, count+1, flag);

		return flag;
	}
}
