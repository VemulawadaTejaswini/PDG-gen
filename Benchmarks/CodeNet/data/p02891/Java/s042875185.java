import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();

		long count = 0;
		long cntSame = 1;
//		String smpl = String.valueOf(s.charAt(0)); // debug
		for (int i = 1; i < s.length(); i++) {
//			System.out.println("c[i-1]:" + s.charAt(i - 1)
//							+ ", c[i]:" + s.charAt(i));
			if (s.charAt(i - 1) == s.charAt(i)) {
				cntSame++;
//				smpl += s.charAt(i); // debug
			} else {
				count += cntSame / 2;
				cntSame = 1;
//				smpl = String.valueOf(s.charAt(i));
			}
//			System.out.println("smpl:" + smpl); // debug

			if (i == s.length() - 1) {
				count += cntSame / 2;
			}
//			System.out.println("cntSame:" + cntSame
//							+ ", count:" + count); // debug
		}

		long ans = count * k;
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			ans += k - 1;
		}
		System.out.println(ans);

		sc.close();
	}

}
