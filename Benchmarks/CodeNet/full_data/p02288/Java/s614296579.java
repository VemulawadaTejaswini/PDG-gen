import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();

		int[] a = new int[h+1];

		for(int i = 1; i <= h; i++)
			a[i] = scan.nextInt();

		for(int i = h/2; i > 0; i--)
			maxHeap(a, i);

		for(int i = 1; i <= h; i++)
			System.out.print(" "+ a[i]);
		System.out.print("\n");

		scan.close();
		System.exit(0);
	}

	private static void maxHeap(int[] a, int i){
		int l = i * 2;
		int r = i * 2 + 1;
		int max = i;
		if(l < a.length && a[l] > a[i])
			max = l;
		if(r < a.length && a[r] > a[max])
			max = r;
		if(max != i){
			int work = a[i];
			a[i] = a[max];
			a[max] = work;
			maxHeap(a, max);
		}
	}
}