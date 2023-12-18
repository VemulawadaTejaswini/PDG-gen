import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int[] a=new int[n];
	public static void main(String[] args){
		int count=1;
		int ans;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		quicksort(a,0,n-1);
		for(int i=0;i<n-1;i++){
			if(a[i]<a[i+1]) count++;
		}
		if(count%2==0) ans=count-1;
		else ans=count;
		System.out.println(ans);
	}
	private static void quicksort(int[] a,int left,int right){
		int s,i,j;
		if(left<right){
			s=a[(left+right)/2];
			i=left-1; j=right+1;
			while(true){
				while(a[++i]<s);
				while(a[--j]>s);
				if(i>=j) break;
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			quicksort(a,left,i-1);
			quicksort(a,j+1,right);
		}
	}
}