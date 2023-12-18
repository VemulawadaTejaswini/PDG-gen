import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		in.close();
		Set<Three> set = new HashSet<>();
		long ans = 0;

		while(true) {
			Three t = new Three(a, b, c);
			if(set.contains(t)) {
				System.out.println(-1);
				return;
			} else {
				set.add(t);
			}
			if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1) break;
			++ans;
			int a2 = a / 2, b2 = b / 2, c2 = c / 2;

			a = b2 + c2;
			b = a2 + c2;
			c = a2 + b2;
		}
		System.out.println(ans);
	}
}

class Three {
	int a, b, c;
	public Three(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + c;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Three other = (Three) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		return true;
	}


}