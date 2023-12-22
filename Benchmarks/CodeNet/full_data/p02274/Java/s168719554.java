import java.util.Scanner;

class Main{
	static long inverse=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] sorts=new int[N];
		for(int i=0; i<N; i++) {
			sorts[i]=sc.nextInt();
		}
		sort(sorts);
		pl(inverse);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void mergesort(int[] splits) {
		if(splits.length>1) {
			int len=splits.length;
			int left=len/2;
			int right=len-left;
			int[] leftarray=new int[left];
			int[] rightarray=new int[right];
			for(int i=0; i<len; i++) {
				if(i<left) {
					leftarray[i]=splits[i];
				}
				else {
					rightarray[i-left]=splits[i];
				}
			}
			mergesort(leftarray);
			mergesort(rightarray);
			merge(leftarray,rightarray,splits);
		}
	}
	public static void merge(int[] a,int[] b,int[] source) {
		int left=0;
		int right=0;
		while(left<a.length || right<b.length) {
			if(right>=b.length || (left<a.length && a[left]<=b[right])) {
				source[left+right]=a[left];
				left++;
			}
			else {
				source[left+right]=b[right];
				inverse+=((long)a.length)-((long)left);
				right++;
			}
		}
	}
	public static void sort(int[] sortarray) {
		mergesort(sortarray);
	}
}
