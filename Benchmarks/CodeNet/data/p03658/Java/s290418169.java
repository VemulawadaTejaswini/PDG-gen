import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),k=stdIn.nextInt(),l[]=new int[50],s=0,i,j,t;
		for(i=0;i<n;i++) l[i]=stdIn.nextInt();
		for(i=0;n-1>i;i++) {
			for(j=n-1;j>i;j--) {
				if(l[j]>l[j-1]) {
					t=l[j];
					l[j]=l[j-1];
					l[j-1]=t;
				}
			}
		}
		for(i=0;i<k;i++) s+=l[i];
		System.out.print(s);
	}
}