import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[3*N];
		for(int i = 0; i < 3*N; i++)
			 a[i] = sc.nextInt();
		 
		quickSort(a);
		
		long sum = 0;
		for(int i = 0; i < N; i++)
			sum += a[3*N-1-(2*i+1)];
		
		System.out.println(sum);
	}
	
	static void quickSort(int[] a, int left, int right){
		if(left >= right){
			return;
		}
		int pl = left, pr = right, tmp;
		int p = a[(pl+pr)/2];
		while(pl <= pr) {
			while(a[pl] < p) { pl++; }
			while(a[pr] > p) { pr--; }
			if (pl <= pr){
				tmp = a[pl]; a[pl++] = a[pr]; a[pr--] = tmp;
			}
        }
        quickSort(a, left, pr);
        quickSort(a, pl, right);
	}
	
	static void quickSort(int[] a){
		quickSort(a, 0, a.length-1);
	}
}