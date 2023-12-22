import java.util.*;

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2) return 1;
		if(o1 > o2) return -1;
		return 0;
	}
	
}
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Comparator<Integer> comp = new MyComp();
		OUT:while(true) {
			int N = stdIn.nextInt();
			if(N == 0) {
				break;
			}
			Integer[] a = new Integer[N];
			Integer[] b = new Integer[N];
			for(int i = 0; i < N; i++) {
				a[i] = stdIn.nextInt();
			}
			for(int i = 0; i < N; i++) {
				b[i] = stdIn.nextInt();
			}
			Arrays.sort(a,Collections.reverseOrder());
			Arrays.sort(b,Collections.reverseOrder());
			
			int w = 0;
			for(int i = 0; i < N; i++) {
				if(a[i] > b[i]) {
					w++;
				}
				if(Math.nextUp((i+1)/2.0) <= w) {
					if(i == N-1) {
						break;
					}
					System.out.println((i+1));
					continue OUT;
				}
			}
			System.out.println("NA");
			
			
		}
		
	}
}