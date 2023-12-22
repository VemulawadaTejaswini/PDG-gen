import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a[]=new int[100],i,j,t;
		for(i=0;i<n;i++)a[i]=stdIn.nextInt();
		for(i=0;i<n;i++){
			t=a[i];
			j=i-1;
			while(j>=0&&a[j]>t){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
			for(j=0;j<n-1;j++)System.out.print(a[j]+" ");
			System.out.println(a[n-1]);
		}
	}
}
