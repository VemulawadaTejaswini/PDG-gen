import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n];

		int halfPosition=0;

		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
			if(p[i]==(n+1)/2) {
				halfPosition=i;
			}
		}
		sc.close();
		System.out.println(downFinder(halfPosition, n, p)+upFinder(halfPosition, n, p));
	}

	public static int downFinder(int a, int n, int[] p) {

		int max=0;
		int beforeA=n;
		while(p[a]>1) {
			for(int i=a+1;i<beforeA;i++) {
				if(p[i]<p[a]&&p[i]>max) {
					max=p[i];
				}
			}
			if(max==0) {
				for(int i=0;i<n;i++) {
					if(p[i]==p[a]-1) {
						beforeA=a;
						a=i;
						break;
					}
				}
			}
			else {
				break;
			}
		}
		return max;
	}

	public static int upFinder(int a, int n, int[] p) {

		int min=n+1;
		int beforeA=0;
		while(p[a]<n) {
			for(int i=a-1;i>=beforeA;i--) {
				if(p[i]>p[a]&&p[i]<min) {
					min=p[i];
				}
			}
			if(min==n+1) {
				for(int i=n-1;i>=0;i--) {
					if(p[i]==p[a]+1) {
						beforeA=a;
						a=i;
						break;
					}
				}
			}
			else {
				break;
			}

		}
		return n+1-min;
	}

}
