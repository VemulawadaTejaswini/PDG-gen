import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static boolean res = false;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int Q = in.nextInt();
		int[] a = new int[Q+1];
		for (int i = 1; i < Q+1; i++) {
			a[i] = in.nextInt();
		}
		
		ArrayList<Integer>[] ns = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) {
			ns[i] = new ArrayList<Integer>();
			ns[i].add(0);
			for (int j = 1; j <= M; j++) {
				ns[i].add(j);
			}
		}

		shuffle( ns, a, 1);
		
		if (res==true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

	private static void shuffle( ArrayList<Integer>[] ns, int[] a, int i) {
		// TODO Auto-generated method stub
		if (i==a.length) {
			boolean check = isAligh(ns);
			if (check) {
				res = check;
			}
			return;
		}
		for (int j = 1; j < ns.length; j++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>(ns[j].size());
			ArrayList<Integer> tmp1 = new ArrayList<Integer>(ns[j].size());
			for (Integer item: ns[j]) {
				tmp.add(item);
				tmp1.add(item);
			}
			
			tmp1.remove((Object)a[i]);
			tmp1.add(1,a[i]);
			ns[j] = tmp1;
			shuffle( ns, a, i+1);
			ns[j] = tmp;		
		}
	}

	private static boolean isAligh(ArrayList<Integer>[] ns) {
		// TODO Auto-generated method stub
		boolean ans = true;
		for (int i = 1; i < ns[1].size() ; i++) {
			if (ans==false) {
				break;
			}
			for (int j = 1; j < ns.length-1; j++) {
				if (ns[j].get(i)==ns[j+1].get(i)) {
					continue;
				}else {
					ans = false;
					break;
				}
			}
		}
		
		return ans;
	}

	
}
