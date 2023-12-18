import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		ArrayList<Abc> abl = new  ArrayList<>(n);
		int i;
		for(i = 0; i < n; i++) {
			Abc ab = new Abc(sc.nextLong(), sc.nextLong());
			abl.add(ab);
		}
		sc = null;
		Collections.sort(abl, new Abcmp());
		long yen = 0;
		long m1 = m;
		for(i = 0; i < n; i++) {
			if(m1 >= abl.get(i).b) {
				yen += abl.get(i).a * abl.get(i).b;
				m1 -= abl.get(i).b;
			} else {
				yen += abl.get(i).a * m1;
				break;
			}
		}
		System.out.println(yen);
	}
}

class Abc {
	long a;
	long b;
	Abc(long a, long b) {
		this.a = a;
		this.b = b;
	}
}

class Abcmp implements  Comparator<Abc> {
	@Override
	public int compare(Abc p1, Abc p2) {
		return p1.a < p2.a ? -1 : (p1.a > p2.a ? 1 : 0);
	}
}
