import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(), N = sc.nextInt();
		int d[][] = new int[3][100];
		int n=0;
		if(D == 0) {
			for(int i=1; ;i++) {
				if(i%100 != 0) {
					d[0][n]=i;
					n++;
				}
				if(n > N)break;
			}
		}else if(D == 1) {
			for(int i=1; ;i++) {
				if(i%100 == 0) {
					if(i%10000 != 0) {
						d[1][n]=i;
						n++;
					}
				}
				if(n > N)break;
			}
		}else if(D == 2) {
			for(int i=1; ;i++) {
				if(i%10000 == 0) {
					d[2][n]=i;
					n++;
				}
				if(n > N)break;
			}
		}
		System.out.println(d[D][N-1]);
		sc.close();
	}

}