import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b20 = 2_000_000;
		int[] a = new int[b20+1];
		a[0] = 0;

		for(;;){
			String s = scan.next();
			if(s.equals("end"))
				break;
			if(s.equals("insert")){
				int k = scan.nextInt();
				insert(a, k);
			}else if(s.equals("extract"))
				System.out.println(extract(a));
		}

		scan.close();
		System.exit(0);
	}

	private static void insert(int[] a, int k){
		a[0]++;
		a[a[0]] = k;
		up(a, a[0]);
	}
	private static void up(int[] a, int i){
		if(i > 1 && a[i] > a[i/2]){
			int tmp = a[i];
			a[i] = a[i/2];
			a[i/2] = tmp;
			up(a, i/2);
		}
	}

	private static int extract(int[] a){
		int r = a[1];
		a[1] = a[a[0]];
		maxHeap(a, 1);
		return r;
	}
	private static void maxHeap(int[] a, int i){
		int l = i * 2;
		int r = i * 2 + 1;
		int max = i;
		if(l <= a[0] && a[l] > a[i])
			max = l;
		if(r <= a[0] && a[r] > a[max])
			max = r;
		if(max != i){
			int tmp = a[i];
			a[i] = a[max];
			a[max] = tmp;
			maxHeap(a, max);
		}
	}
}