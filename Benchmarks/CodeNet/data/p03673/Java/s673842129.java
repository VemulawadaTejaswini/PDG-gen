import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		for(int i = 1; i < n; i += 2) left.add(a[i]);
		for(int i = 0; i < n; i += 2) right.add(a[i]);
		if(n % 2 == 0) {
			Collections.reverse(left);
			System.out.print(left.get(0)); left.remove(0);
			for(int i : left) System.out.print(" " + i);
			for(int i : right) System.out.print(" " + i);
			System.out.println();
		}else {
			Collections.reverse(right);
			System.out.print(right.get(0)); right.remove(0);
			for(int i : right) System.out.print(" " + i);
			for(int i : left) System.out.print(" " + i);
			System.out.println();
		}
	}
}