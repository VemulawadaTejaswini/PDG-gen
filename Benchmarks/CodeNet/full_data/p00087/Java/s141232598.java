import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		double t;
		ArrayDeque<Double> ad = new ArrayDeque<Double>();
		while ((str = bf.readLine()) != null) {
			String p[] = str.split(" ");
			ad.clear();
			for (int i = 0; i < p.length; i++) {
				if (p[i].length() == 1) {
					switch (p[i].charAt(0)) {
					case '+':
						t = ad.pollLast();
						ad.addLast(ad.pollLast() + t);
						break;
					case '-':
						t = ad.pollLast();
						ad.addLast(ad.pollLast() - t);
						break;
					case '*':
						t = ad.pollLast();
						ad.addLast(ad.pollLast() * t);
						break;
					case '/':
						t = ad.pollLast();
						ad.addLast(ad.pollLast() / t);
						break;
					default:
						ad.addLast(Double.valueOf(p[i]));
					}
				} else {
					ad.addLast(Double.valueOf(p[i]));
				}
			}
			System.out.println(ad.pollLast());
		}
	}
}