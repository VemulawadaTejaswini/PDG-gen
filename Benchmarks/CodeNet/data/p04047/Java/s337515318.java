import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a[]=new int[200],i,j,t,s=0;
		for(i=0;i<2*n;i++) a[i]=stdIn.nextInt();
		for(i=0;i<2*n-1;i++) {
			for(j=2*n-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<n*2;i+=2) {
			if(a[i]>a[i+1]) s+=a[i+1];
			else s+=a[i];
		}
		System.out.print(s);
	}
}