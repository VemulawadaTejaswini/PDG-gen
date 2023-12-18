import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for (int i=0;i<Q;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<S.length();i++) {
			if (S.charAt(i)=='A') {
				if (S.charAt(i+1)=='C') {
					list.add(i);
				}
			}
		}

		for (int i=0;i<Q;i++) {
			List<Integer> list_copy = new ArrayList<Integer>();
			list_copy.addAll(list);
			final int I = i;
			list_copy.removeIf(youso -> youso<l[I]-1);
			list_copy.removeIf(youso -> youso>=r[I]-1);
			System.out.println(list_copy.size());
		}
	}
}