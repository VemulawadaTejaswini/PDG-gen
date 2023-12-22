import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve100();
	}

	public static void solve100(){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int nmin = sc.nextInt();
			int nmax = sc.nextInt();
			if(m==0&nmin==0&nmax==0) {
				break;
			}
			int sa =0 ;
			int kazu=0;
			int[] P = new int[m];
			for(int i=0;i<m;i++) {
				P[i] = sc.nextInt();
			}
			for(int i=nmin-1;i<nmax;i++) {
				if(sa <= (P[i]-P[i+1])) {
					sa = P[i]-P[i+1];
					kazu=i+1;
				}
			}
			System.out.println(kazu);
		}
	}

}
