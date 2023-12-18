import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		ArrayList<Integer> ten = new ArrayList<>();
		ArrayList<String> mozi = new ArrayList<>();
		ArrayList<Integer> bango = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			mozi.add(sc.next());
			ten.add(sc.nextInt());
			bango.add(i+1);
		}
		for (int i = N-1; i >= 0; i--) {
			if (i > 0) {
				for (int j = i-1; j>= 0; j--) {
					if (mozi.get(i).compareTo(mozi.get(j)) < 0) {

						// jがiより辞書順に後ろの場合
						String a = mozi.get(j);
						String b = mozi.get(i);
						int c = bango.get(j);
						int d = bango.get(i);
//						System.out.println("==");
//						System.out.println(a);
//						System.out.println(b);
//						System.out.println(c);
//						System.out.println(d);
//						System.out.println("==");
						mozi.set(i, a);
						mozi.set(j, b);
						bango.set(i, c);
						bango.set(j, d);
					} else if (mozi.get(i).compareTo(mozi.get(j)) == 0) {
						if (ten.get(i) > ten.get(j)) {
							int a = ten.get(j);
							int b = ten.get(i);
							int c = bango.get(j);
							int d = bango.get(i);
							ten.set(i, a);
							ten.set(j, b);
							bango.set(i, c);
							bango.set(j, d);
						}
					}
			}
		}
		}
		//System.out.println("--");
		for (int i = 0; i < N; i++) {
			System.out.println(bango.get(i));
		}

	}
}