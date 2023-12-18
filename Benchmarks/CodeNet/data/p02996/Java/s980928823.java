import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<int[]> list = new LinkedList<int[]>();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];

		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
			int[] tmp={A[i],B[i]};
			list.add(tmp);
		}

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.valueOf(o1[1]).compareTo(Integer.valueOf(o2[1]));
            }
        };

        Collections.sort(list,comparator);
        List<int[]> list_2 = new ArrayList<int[]>(list);
        long time = 0L;

        for (int i=0;i<N;i++) {
        	time+=list_2.get(i)[0];
        	if (time>list_2.get(i)[1]) {
        		System.out.println("No");
        		break;
        	}
        	if (i==N-1) {
        		System.out.println("Yes");
        	}
        }
	}
}