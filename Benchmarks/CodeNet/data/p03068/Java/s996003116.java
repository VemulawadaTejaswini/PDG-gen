import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();

		char x = S.charAt(K-1);
		List<String> list = new ArrayList<String>();
		for (int i=0;i<N;i++) {
			if (S.charAt(i)!=x) {
				list.add("*");
			} else  {
				list.add(String.valueOf(x));
			}
		}
		for (int i=0;i<N;i++) {
			System.out.print(list.get(i));
		}
	}
}