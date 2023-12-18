import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int starth;
		if(N%4==0) {
			starth = 3*N/4;
		} else {
			starth = 3*N/4+1;
		}
		for(int h=starth; h<=3500; h++) {
			for(int w=1; w<=3*N/4; w++) {
				for(int n=w; n<=h; n++) {
					if(4*h*n*w==N*(h*n+n*w+h*w)) {
						System.out.println(h + " " + n + " " + w);
						return;
					}
				}
			}
		}
	}
}
