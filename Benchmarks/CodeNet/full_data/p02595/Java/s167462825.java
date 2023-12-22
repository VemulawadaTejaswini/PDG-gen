import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Ab> getStrings(Scanner sc, int num) {
		List<Ab> stringList = new ArrayList<>();
		while(num>0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			stringList.add(new Ab(a,b));
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		List<Ab> array = getStrings(sc, n);
		int result = 0;
		for(Ab ab: array) {
			if (ab.a * ab.a + ab.b * ab.b <= d*d) {
				result++;
			}
		};
		System.out.println(result);

	}

	public static class Ab {
		public long a;
		public long b;

		public Ab(long a, long b) {
			this.a = a;
			this.b = b;
		}

		public long getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public long getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

}
