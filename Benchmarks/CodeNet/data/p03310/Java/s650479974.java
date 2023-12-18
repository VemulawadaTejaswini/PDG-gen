import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		int B=0,C=0,D=0,E=0,F=1,G=1000000000,H,I=1000000000;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N-3;i++) {
			for(int k=i+1;k<N-2;k++) {
				for(int m=k+1;m<N-1;m++) {
					for(int a=0;a<=i;a++) {
						B=B+A[a];
					}
					if(B>=F) {
						F=B;
					}
					if(B<=G) {
						G=B;
					}
					for(int b=i+1;b<=k;b++) {
						C=C+A[b];
					}
					if(C>=F) {
						F=C;
					}
					if(C<=G) {
						G=C;
					}
					for(int c=k+1;c<=m;c++) {
						D=A[c]+D;
					}
					if(D>=F) {
						F=D;
					}
					if(D<=G) {
						G=D;
					}
					for(int d=m+1;d<N;d++) {
						E=A[d]+E;
					}
					if(E>=F) {
						F=E;
					}
					if(E<=G) {
						G=E;
					}
					H=F-G;
					if(H<I) {
						I=H;
					}
					F=1;
					G=1000000000;
				}
			}
		}
		System.out.println(I);
	}
}