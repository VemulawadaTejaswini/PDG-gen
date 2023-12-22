
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<=n-1;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		int cnt=1;
		for(int i=0;i<n;i++) {
			cnt=1;
			for(int j=0;j<n;j++) {
				if((x[i]<x[j]&&y[i]<y[j])||(x[i]>x[j]&&y[i]>y[j])) {
					cnt++;
					}
				}
			System.out.println(cnt);
		}
		sc.close();
		}
	}