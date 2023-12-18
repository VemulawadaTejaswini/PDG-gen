
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Long p[] = new Long[a];
		Long q[] = new Long[b];
		Long r[] = new Long[c];
		for(int i=0; i<a; i++) p[i]=sc.nextLong();
		for(int i=0; i<b; i++) q[i]=sc.nextLong();
		for(int i=0; i<c; i++) r[i]=sc.nextLong();
		Arrays.sort(p, Collections.reverseOrder());
		Arrays.sort(q, Collections.reverseOrder());
		Arrays.sort(r, Collections.reverseOrder());

		long sum = 0;
		int i=0;
		int j=0;
		int k=0;
		while(k<x) {
			if(j<c && p[i]<r[j]) {
				sum += r[j];
				j++;
			}else {
				sum += p[i];
				i++;
			}
			k++;
		}
		k=0;
		i=0;
		while(k<y) {
			if(j<c && q[i]<r[j]) {
				sum += r[j];
				j++;
			}else {
				sum += q[i];
				i++;
			}
			k++;
		}
		System.out.println(sum);
		sc.close();
	}
}
