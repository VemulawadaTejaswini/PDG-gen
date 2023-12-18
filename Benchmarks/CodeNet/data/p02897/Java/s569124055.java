import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int cnt = 0;
		for (int i=0;i<N;i++) {
			if ((i+1)%2==1) {
				cnt++;
			}
		}
		System.out.println((double)cnt/(double)N);
	}
}