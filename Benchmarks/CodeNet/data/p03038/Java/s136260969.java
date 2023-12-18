import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		int[] c=new int[m];
		long ans=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		long sum=0;
		for(int j=0;j<m;j++){
			Arrays.sort(a);
			for(int i=0;i<b[j];i++){
				if(a[i]<c[j])
					a[i]=c[j];
			}
		}

		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		System.out.println(sum);
	}
}