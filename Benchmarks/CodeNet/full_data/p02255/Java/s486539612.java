import java.util.Scanner;

class Main {
	
	static void swap(int[] a,int x,int y){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		return;
	}
	
	static void printa(int[] a,int n){
		for(int i=0;i<n-1;i++){
			System.out.printf("%d ",a[i]);
		}
		System.out.println(a[n-1]);
		return;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		
		for(int i=0;i<n;i++){
			int x=a[i];
			int j=i-1;
			while(j>=0 && a[j] > x){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=x;
			
			printa(a,n);
			
		}
	}
}
