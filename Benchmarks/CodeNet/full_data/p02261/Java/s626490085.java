import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Character m[] = new Character[n];
		Integer a[] = new Integer[n];
		for(int i = 0; i < n; i++) {
			String tmp = sc.next();
			m[i] = tmp.charAt(0);
			a[i] = Integer.parseInt(tmp.substring(1));
		}
		
		ArrayList<Character> sm = new ArrayList<Character>();
		ArrayList<Character> bm = new ArrayList<Character>(Arrays.asList(m));
		ArrayList<Integer> ba = new ArrayList<Integer>(Arrays.asList(a));
		sm = BubbleSort(n, bm, ba);
		
		//SelectionSort
		for(int i = 0; i < n; i++) {
			int minj = i;
			for(int j = i; j < n; j++) {
				if(a[j] < a[minj]) {
					minj = j;
				}
			}
			int tmp = a[i];
			a[i] = a[minj];
			a[minj] = tmp;
			char tmpc = m[i];
			m[i] = m[minj];
			m[minj] = tmpc;
		}
		
		boolean ifstable = true;
		for(int i = 0; i < n; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(m[i]);
			System.out.print(a[i]);
			if(sm.get(i) != m[i]) ifstable = false;
		}
		if(ifstable) System.out.println("\nStable");
		else System.out.println("\nNot stable");
	}
	
	private static ArrayList<Character> BubbleSort(int n, ArrayList<Character> bm, ArrayList<Integer> ba){
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int j = n-1; j > 0; j--) {
				if(ba.get(j) < ba.get(j-1)) {
					int tmp = ba.get(j);
					ba.set(j, ba.get(j-1));
					ba.set(j-1, tmp);
					char tmpc = bm.get(j);
					bm.set(j, bm.get(j-1));
					bm.set(j-1, tmpc);
					flag = true;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(bm.get(i));
			System.out.print(ba.get(i));
		}
		System.out.println("\nStable");
		
		return bm;
	}
}
