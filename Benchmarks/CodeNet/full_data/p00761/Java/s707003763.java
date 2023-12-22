import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a [] = new int[21];
		int L;

		for(a[0]=sc.nextInt(),L=sc.nextInt();a[0]!=0 || L!=0;a[0]=sc.nextInt(),L=sc.nextInt()) {
			int A [] = new int [L];
			for(int k=0;k<20;k++) {
				int temp=a[k];
				for(int i=0;i<L;i++) {
					A[i]=temp/(int)Math.pow(10,L-1-i);
					temp-=A[i]*(int)Math.pow(10,L-1-i);
				}
				for(int j=L;j>0;j--) {
					for(int i=0;i<j-1;i++) {
						if(A[i]<A[i+1]) {
							temp = A[i];
							A[i] = A[i+1];
							A[i+1] = temp;
						}
					}
				}
				int max=0;
				int min=0;
				for(int i=0;i<L;i++) {
					max+=A[i]*(int)Math.pow(10,L-1-i);
					min+=A[i]*(int)Math.pow(10,i);
				}
				a[k+1]=max-min;
			}

			int flag=0;
			for(int j=0;j<20 && flag==0 ;j++) {
				for(int i=j+1;i<=20 && flag==0 ;i++) {
					if(a[j]==a[i]) {
						System.out.printf("%d %d %d\n",j,a[i],i-j);
						flag=1;
					}
				}
			}

		}


	}
}
