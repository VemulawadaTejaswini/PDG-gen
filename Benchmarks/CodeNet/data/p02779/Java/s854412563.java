import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		// input
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		// 重複していたらその時点でNO
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++){
		    if(intList.contains(a[i])) {
		    	System.out.println("NO");
		    	return;
		    }
		    intList.add(a[i]);
		}
		System.out.println("YES");		
	}
}