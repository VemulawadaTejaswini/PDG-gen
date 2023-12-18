
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		int maxa = 0;
		int maxi = 0;
		for(int i=0; i<n; i++) {
			a.add(sc.nextInt());
			b.add(sc.nextInt());
			if(maxa < a.get(i)) {
				maxa = a.get(i);
				maxi = i;
			}

		}

		Collections.sort(b, Collections.reverseOrder());
		long cnt = 0;

		for(int i=0; i<n; i++) {

			if(b.get(i)>maxa) {
				cnt++;
				h -= b.get(i);
				if(h<=0) {
					System.out.println(cnt);
					sc.close();
					return;
				}
			}
		}



		if(h>0) {
			cnt += (h + (maxa -1))/maxa;
		}

		System.out.println(cnt);
		sc.close();
	}
}
