import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private int[] a;
	private int[] b;
	
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		int lim = Integer.parseInt(sc.nextLine());
		
		a = new int[lim];		
		b = new int[lim];
		for (int i = 0; i < lim; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = a[i];
		}
		Arrays.sort(b);

		int max = 0;
		HashMap<Integer, ArrayList<Integer[]>> iset = new HashMap<Integer, ArrayList<Integer[]>>();
		for (int i = 0; i < lim; i++) {
			for (int j = (i + 1); j < lim; j++) {
				int sum = a[i] + a[j];
				Integer[] ij = {i, j};

				ArrayList<Integer[]> ijlist;
				if (iset.containsKey(sum) == false) {
					ijlist = new ArrayList<Integer[]>();
				} else {
					ijlist = iset.get(sum);
				}
				ijlist.add(ij);
				
				iset.put(sum, ijlist);
				
				if (max < sum) max = sum;
			}
		}
		
		int ans = 0;
		boolean judge = false;
		for (int i = 0; i < max; i++) {
			ArrayList<Integer[]> tmp;
			if (iset.containsKey(i) == true) {
				tmp = iset.get(i + 1);
			} else {
				continue;
			}
			
			for (int j = 0; j < tmp.size(); j++) {
				Integer[] ij = tmp.get(j);
				
				int small = ij[0];
				int large = ij[1];
				
				if (a[small] == b[large]) {
					a[small] = a[large];
					a[large] = b[large];
					
					ans = ans + a[small] + a[large];
				}
				if (a[large] == b[small]) {
					a[large] = a[small];
					a[small] = b[small];
					
					ans = ans + a[small] + a[large];
				}
				
				judge = true;
				for (int k = 0; k < lim; k++) {
					if (a[k] != b[k]) {
						judge = false;
						break;
					}
				}
				if (judge) break;
			}
		}
		
		
		
		System.out.println(ans);
	}
}