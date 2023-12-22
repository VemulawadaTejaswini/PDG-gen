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
		MyComp comp = new MyComp();
		OUT:while(true) {
			int N = stdIn.nextInt();
			if(N == 0) {
				break;
			}
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = stdIn.nextInt();
			}
			for(int i = 0; i < N; i++) {
				b[i] = stdIn.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			
			int w = 0;
			for(int i = N-1; i >= 0; i--) {
				if(a[i] > b[i]) {
					w++;
				}
				if((N - i)/2 < w) {
					System.out.println(N - i);
					continue OUT;
				}
			}
			System.out.println("NA");
			
			
		}
		
	}
}