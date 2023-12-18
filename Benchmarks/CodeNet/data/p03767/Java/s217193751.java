import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[3*N];
		for(int i = 0; i < 3*N; i++)
			 a[i] = sc.nextInt();
		 
		quickSort(a, 0, a[3*N-1]);
		
		long sum = 0;
		for(int i = 0; i < N; i++){
			sum += a[3*N-1-(2*i+1)];
		}
		System.out.println(sum);
	}
	
	static void swap(int[] a, int idx1, int idx2){
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void quickSort(int[] a, int left, int right){
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		do {
			while(a[pl] < x)
				pl++;
			while(a[pr] > x)
				pr--;
			  if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) 
            quickSort(a, left, pr);
        if (pl < right)
            quickSort(a, pl, right);
	}
}