import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int t = in.nextInt();
			if (t == 1) {
				if(s.length() % 2 == 0) {
					String begin = s.substring(0, s.length()/2);
					String end = s.substring(s.length()/2, s.length());
					s = end + begin;
				} else {
					String begin = s.substring(0, s.length()/2);
					String middle = s.substring(s.length()/2, s.length()/2+1);
					String end = s.substring(s.length()/2+1);
					s = end + middle + begin;
				}
			} else {
				int f = in.nextInt();
				String c = in.next();
				if (f == 1) {
					s = c + s;
				} else {
					s = s + c;
				}
			}
		}
		System.out.println(s);
	}
}
