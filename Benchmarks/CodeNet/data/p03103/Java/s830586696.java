import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Long> A = new ArrayList<Long>();
		List<Integer> B = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			A.add(sc.nextLong());
			B.add(sc.nextInt());
		}
		List<Long> C = new ArrayList<Long>();
		for (int i=0;i<N;i++) {
			C.add(A.get(i));
		}
		Collections.sort(A);
		List<Integer> D = new ArrayList<Integer>();

		for (int i=0;i<N;i++) {
			D.add(B.get(C.indexOf(A.get(i))));
			B.remove(C.indexOf(A.get(i)));
			C.remove(C.indexOf(A.get(i)));
		}
		int num=0;
		Long cost=(long)0;
		/*
		while (M>0) {
			if (M>=D.get(num)) {
				M=M-D.get(num);
				cost=cost+A.get(num)*D.get(num);
				num++;
			}else {
				break;
			}
		}
		if (M>0) {
			cost=cost+A.get(num)*M;
		}
		*/
		System.out.println(cost);

	}
}