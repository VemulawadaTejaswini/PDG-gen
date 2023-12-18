import java.util.Scanner;

class Main{
	static void swap(int[] a,int idx1,int idx2){
		int t = a[idx1]; a[idx1] = a[idx2];  a[idx2] = t;
	}
	
	static void quicksort(int[] a,int left,int right){
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do{
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr) swap(a,pl++,pr--);
		} while(pl <= pr);
		
		if(left < pr) quicksort(a,left,pr);
		if(pl < right) quicksort(a,pl,right);
	}
	
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		
		int nx = std.nextInt();
		int[] x = new int[nx];
		int k = std.nextInt();
		int sum = 0;
		
		for(int i = 0;i < nx;i++){
			x[i] = std.nextInt();
		}
		
		quicksort(x,0,nx-1);
		
		for(int i = x.length - 1;i >= nx - k;i--){
			sum += x[i];
		}
		System.out.print(sum);
	}
}