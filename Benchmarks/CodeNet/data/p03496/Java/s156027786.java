
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a[] = new int[N];

		int max=-Integer.MAX_VALUE;
		int maxi = -1;
		int min=Integer.MAX_VALUE;
		int mini = -1;
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
			if(max<a[i]) {
				max=a[i];
				maxi=i;
			}
			if(min>a[i]) {
				min=a[i];
				mini=i;
			}
		}
		System.out.println(2*N-1);
		if(Math.abs(max)>=Math.abs(min)) {
			for(int i=0; i<N; i++) {
				System.out.println((maxi+1)+" "+(i+1));
			}
			for(int i=0; i<N-1; i++) {
				System.out.println((i+1) + " "+ (i+2));
			}
		}else {
			for(int i=0; i<N; i++) {
				System.out.println((mini+1)+" "+(i+1));
			}
			for(int i=N-1; i>=1; i--) {
				System.out.println((i+1) + " "+ i);
			}
		}

		sc.close();
	}
}
