import java.util.*;

public class Main{
	public static void main(String args[]){
		new Main();
	}

	public Main(){
		int size = 0;
		int sum = 0;
		int[] data = null;
		List<Integer> Ans = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while(true){
			size = sc.nextInt();

			if(size == 0) break;

			data = new int[size];
			for(int i=0; i<size; i++){
				data[i] = sc.nextInt();
			}

			QuickSort(data, 0, size-1);

			sum = 0;
			for(int i=0; i<size; i++){
				sum += data[i] * (size - i - 1);
			}
			Ans.add(sum);
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}

	public void QuickSort(int[] a, int start, int end){
		if(start == end) return;
		int p = pivot(a, start, end);
		if(p != -1){
			int k = partition(a, start, end, a[p]);
			QuickSort(a, start, k-1);
			QuickSort(a, k, end);
		}
	}

	public int pivot(int[] a, int start, int end){
		int k = start+1;
		while(k <= end && a[start] == a[k]) k++;
		if(k > end) return -1;
		if(a[start] >= a[k]) return start;
		return k;
	}

	public int partition(int[] a, int start, int end, int x){
		int l = start;
		int r = end;

		while(l <= r){
			while(l <= end && a[l] < x) l++;

			while(r >= start && a[r] >= x) r--;

			if(l > r) break;
			int t = a[l];
			a[l] = a[r];
			a[r] = t;
			l++;
			r--;
		}

		return l;
	}
}