import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,M;
		N= sc.nextInt();
		M= sc.nextInt();
		int a[],b[];
		a = new int[3];
		b = new int[3];
		a[0] = a[1]=a[2]=0;
		b[0] = b[1]=b[2]=0;
		for (int i =0;i<M;i++) {
			int s,c ;
			s= sc.nextInt();
			c= sc.nextInt();
			if (a[s-1]==0 && b[s-1]==0) {
				a[s-1] =c;
			}else if (a[s-1]==0 && b[s-1]>0) {
				if (c!=0) {
					System.out.println("-1");
					return ;
				}
			}else {
				if (a[s-1] !=c) {
					System.out.println("-1");
					return ;
				}
				if (s==1&&c==0&&N>1) {
					System.out.println("-1");
					return ;
				}
			}
			b[s-1]++;
		}
		if (N>1 && a[0]==0) {
			a[0]=1;
		}
		for (int i=0;i<N;i++) {
			System.out.print(a[i]);
		}
	}
}