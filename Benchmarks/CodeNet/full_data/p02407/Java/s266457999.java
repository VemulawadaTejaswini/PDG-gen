import java.util.Scanner;
class a20{
	public static void main(String args[]){
		int n,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=n-1;i>0;i--)
			System.out.print(a[i]+" ");
		System.out.println(a[0]);
	}
}
