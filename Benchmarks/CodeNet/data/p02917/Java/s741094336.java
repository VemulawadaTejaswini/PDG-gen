import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] b=new int[n-1];
		for(int i=0; i<n-1; i++){
			b[i]=sc.nextInt();
		}
		int[] a=new int[n];
		a[n-1]=Integer.MAX_VALUE;
		for(int i=n-2; i>=0; i--){
			a[i]=b[i];
			if(a[i+1]>b[i]){
				a[i+1]=b[i];
			}
		}
		int sum=0;
		for(int i=0; i<n; i++){
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
