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

		while (flag) {
			int r = main.findR (N, list);
			int w = main.findW(N, list);

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

	int findR (int N, char[] list) {
		for (int index=N-1; index>=0; index--) {
			if (list[index]=='R') {
				return index;
			}
		}
		return N;
	}
	int findW (int N, char[] list) {
		for (int index=0; index<N; index++) {
			if (list[index]=='W') {
				return index;
			}
		}
		return N;
	}


}
