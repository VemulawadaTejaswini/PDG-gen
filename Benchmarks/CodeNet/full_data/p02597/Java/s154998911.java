class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		char[] list = new char [N];
		String color = sc.next();

		for (int index=0; index<N; index++) {
			list[index] = color.charAt(index);
		}
		int count = 0;
		boolean flag = true;
		int r = 0;
		int w = 0;
		int pr =N-1;
		int pw = 0;

		while (flag) {
			r = main.findR (N, pr, list);
			w = main.findW(N, pw, list);

			if (r==N||w==N) {
				break;
			} else if (r<w) {
				break;
			}

			list[r]='W';
			list[w]='R';
			count++;
		}
		System.out.println(count);

		sc.close();;

	}

	int findR (int N, int pr, char[] list) {
		for (int index=pr; index>=0; index--) {
			if (list[index]=='R') {
				return index;
			}
		}
		return N;
	}
	int findW (int N, int pw, char[] list) {
		for (int index=pw; index<N; index++) {
			if (list[index]=='W') {
				return index;
			}
		}
		return N;
	}


}
