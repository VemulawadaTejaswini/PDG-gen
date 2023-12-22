import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int m = sc.nextInt();
				int nmin = sc.nextInt();
				int nmax = sc.nextInt();
				if(m + nmin + nmax == 0) break;
				
				int [] p = new int[m+1];
				for(int i=1; i<=m; i++) {
					p[i] = sc.nextInt();
				}
				
				int gap = 0;
				int n = 0;
				for(int i=nmin; i<=nmax; i++) {
					if(gap <= p[i] - p[i+1] && n < i) {
						gap = p[i] - p[i+1];
						n = i;
					}
				}
				System.out.println(n);
			}
		}
	}
}
