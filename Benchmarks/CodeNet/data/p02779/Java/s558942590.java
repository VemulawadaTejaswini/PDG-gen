import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<N;++i) {
			set.add(sc.nextInt());
		}
		System.out.println(set.size()==N?"YES":"NO");
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
