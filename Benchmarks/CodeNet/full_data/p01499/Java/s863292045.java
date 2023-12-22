import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int t = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			long sum = 1;
			long mod = 1000000007L;
			for(int i = 1; i < n; i++){
				int ind = bLowerSearch(data, data[i] - t);
				sum = (sum * (i - ind + 1)) % mod;
			}
			System.out.println(sum);
		}
	}
	
	private int bLowerSearch(int a[], int patt){
		int mid, left = 0, right = a.length - 1;
		while(left < right){
			mid = (right + left) / 2;
			if(a[mid] < patt){
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		if(a[left] == patt){
			return left;
		}
		else{
			return right;
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}