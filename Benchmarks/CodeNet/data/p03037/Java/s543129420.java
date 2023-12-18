import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,m;
		int[] l,r;
		int num = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		l = new int[m];
		r = new int[m];
		for(int i=0;i<m;i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		label:for(int i=1;i<=n;i++) {
			gate:for(int j=0;j<m;j++) {
				for(int k=j;k<m;k++) {
					if(l[k]==i) {
						continue gate;
					}
				}
				for(int k=0;k<=j;k++) {
					if(r[k]==i) {
						continue gate;
					}
				}
				continue label;
			}
		num++;
		}
			System.out.println(num);
	}
}