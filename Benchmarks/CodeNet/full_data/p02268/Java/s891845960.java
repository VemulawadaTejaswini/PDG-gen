import java.util.Scanner;

class Main {
	
	static int bin_search(int[] a,int key,int n){
		int left=0; int right=n-1;
		
		while(left<=right){
			int mid=(left+right)/2;
			
			if(a[mid] == key)
				return 1;
			if(a[mid] > key)
				right=mid-1;
			if(a[mid] < key)
				left=mid+1;
			
		}
		
		return 0;
		
	}
	
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] a=new int[n];
		int cnt=0;
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
			
		int q=scan.nextInt();
		for(int i=0;i<q;i++)
			cnt+=bin_search(a,scan.nextInt(),n);
			
		System.out.println(cnt);
	}
}
