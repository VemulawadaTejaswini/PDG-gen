import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] v = new int[N];
		int[] odd = new int[100001];
		int[] even = new int[100001];
		for (int i=0;i<N;i++) {
			v[i] = Integer.parseInt(sc.next());
			if (i%2==0) {
				even[v[i]]++;
			} else if(i%2==1) {
				odd[v[i]]++;
			}
		}
		int odd_index = 0;
		int even_index = 0;
		int odd_max = 0;
		int even_max = 0;
		for (int i=0;i<=100000;i++) {
			odd_max = Math.max(odd_max, odd[i]);
			if (odd_max==odd[i]) {
				odd_index = i;
			}
			even_max = Math.max(even_max, even[i]);
			if (even_max==even[i]) {
				even_index = i;
			}
		}
		if (odd_index!=even_index) {
			System.out.println(N-odd[odd_index]-even[even_index]);
		} else {
			Arrays.sort(odd);
			Arrays.sort(even);
			System.out.println(Math.max(N-odd[99999]-even[100000],N-odd[100000]-even[99999]));
		}
	}
}