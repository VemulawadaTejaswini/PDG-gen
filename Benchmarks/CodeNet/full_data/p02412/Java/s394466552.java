import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i=0;;i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n==0 && x==0)break;
			int j,k,l;
			int count = 0;
			for(j=1;j<=n;j++) {
				for(k=1;k<=n;k++) {
					for(l=1;l<=n;l++) {
						if(j<k&&k<l) {
							if(x==j+k+l) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}

