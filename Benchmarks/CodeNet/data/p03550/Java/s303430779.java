
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int z=sc.nextInt();
		long w=sc.nextLong();
		ArrayList<Long> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a.add(sc.nextLong());
		}

		long max = 0;
		for(int i=0; i<n-1; i++) {
			long tmpmin = Long.MAX_VALUE;
			for(int j=i+1; j<n; j++) {
				long tmp = Math.abs(a.get(i)-a.get(j));
				if(tmpmin > tmp){
					tmpmin = tmp;
				}
			}
			max = Math.max(max, tmpmin);
		}
		max = Math.max(max, Math.abs(a.get(n-1) - w)) ;
		System.out.println(max);
		sc.close();
	}
}
