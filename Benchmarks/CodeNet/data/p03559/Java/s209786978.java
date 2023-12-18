import java.util.*;

public class Main {

  static Scanner in = new Scanner(System.in);
	int[] a, b, c;
	void solve() {
		int n = in.nextInt();
		a = new int[n]; b = new int[n]; c = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		for(int i = 0; i < n; i++) b[i] = in.nextInt();
		for(int i = 0; i < n; i++) c[i] = in.nextInt();
		Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
		long sum = 0;
		for(int i = 0; i < n; i++){
			long t = Math.abs(search(a, b[i], false));
			long s = search(c, b[i], true);
			s = s <= 0 ? n + s : n - s - 1; 
			sum += s * t;
		}
		System.out.println(sum);
	}

  int search(int[] x, int key, boolean f){
	  int left = 0, right = b.length;
	  while(left < right){
		   int mid = (left + right) / 2;
		   if(x[mid] == key){
			   if(f){
			   		while(mid > 0 &&x[mid - 1] == key){
				   		mid--;
					}
				}else{
					while(mid < x.length - 1 &&x[mid + 1] == key){
						mid++;
				 }
				}
			   return mid;
		   }
		   else if(key < x[mid]) right = mid;
		   else left = mid + 1;
	  }
	  return -1 * left;
  }
  
  public static void main(String[] args) {
	  new Main().solve();
  }
}