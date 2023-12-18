import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		int[] ans = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		for (int i=(int)Math.ceil(((double)N)/2);i<N;i++) {
			ans[i] = a[i];
		}
		for (int i=(int)Math.ceil(((double)N)/2)-1;i>=0;i--) {
			int sum = a[i];
			for (int j=2;j*(i+1)<=N;j++) {
				sum+=ans[j*(i+1)-1];
			}
			ans[i]=sum%2;
		}
		// for (int i=N-1;i>=0;i--) {
		// 	System.out.println(i);
		// 	if (a[i]==1) {
		// 		for (int num : divise(i+1)) {
		// 				if (ans[num-1]==0) {
		// 					ans[num-1] = 1;
		// 				} else {
		// 					ans[num-1] = 0;
		// 				}
		// 		}
		// 	}
		// }
		// System.out.println(divise(1));
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(ans));
		int sum_int=0;
		for (int i=0;i<N;i++) {
			if (ans[i]==1) {
				sum_int++;
			}
		}
		System.out.println(sum_int);
		for (int i=0;i<N;i++) {
			if (ans[i]==1) {
				System.out.println(i+1);
			}
		}
	}

    static List<Integer> divise(int n) {
                List<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                list.add(i);
                if (i*i!=n) {
                	list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}