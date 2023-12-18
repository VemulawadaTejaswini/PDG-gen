import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a[]=new int[3],i,j,t;
		for(i=0;i<3;i++) a[i]=stdIn.nextInt();
		for(i=0;i<2;i++) {
			for(j=2;j>i;j--) {
				if(a[j-1]>a[j]) {
					t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print(a[2]-a[1]+a[1]-a[0]);
	}
}