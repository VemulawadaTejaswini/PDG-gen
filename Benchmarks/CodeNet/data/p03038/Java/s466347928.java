import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		int cnt=0;
		List<int[]> b_c = new ArrayList<int[]>();
		for (int i=0;i<M;i++) {
			int b=sc.nextInt();
			if (cnt<100005) {
				cnt+=b;
			}
			int c=sc.nextInt();
			int[] b__c={b,c};
			b_c.add(b__c);
		}
		Arrays.sort(A);

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.valueOf(o2[1]).compareTo(Integer.valueOf(o1[1]));
            }
        };
        Collections.sort(b_c,comparator);

        List<Integer> C = new ArrayList<Integer>();
        int len=0;
        loop:for (int i=0;i<M;i++) {
        	int b=b_c.get(i)[0];
        	int c=b_c.get(i)[1];
        	for (int j=0;j<b;j++) {
        		C.add(c);
        		len++;
        		if (len>100005) {
        			break loop;
        		}
        	}
        }
 //       System.out.println(Arrays.toString(A));
   //     System.out.println(C);

        for (int i=0;i<Math.min(cnt,N);i++) {
        	if (A[i]<=C.get(i)) {
        		A[i]=C.get(i);
        	} else {
        		break;
        	}
        }
        long ans=0L;
        for (int i=0;i<N;i++) {
        	ans+=(long)A[i];
        }
        System.out.println(ans);

	}
}