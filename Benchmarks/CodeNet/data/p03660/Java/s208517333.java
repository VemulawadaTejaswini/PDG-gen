import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int[] sumA;
	static int[] sumB;
	static List<List<Integer>> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumA = new int[n];
		sumB = new int[n];
		list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) list.add(new ArrayList<>());
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		dfsA(0, -1, 0);
		dfsB(n - 1, -1, 0);
		int a = 0, b = 0;
		for(int i = 0; i < n; i++) {
			if(sumA[i] <= sumB[i]) a++;
			else b++;
		}
		if(a > b) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
//		System.out.println(Arrays.toString(sumA));
//		System.out.println(Arrays.toString(sumB));
	}

	static void dfsA(int s, int p, int d) {
		List<Integer> edge = list.get(s);
		for(int v : edge) {
			if(p != v) {
				sumA[v] = d + 1;
				dfsA(v, s, d + 1);
			}
		}
	}

	static void dfsB(int s, int p, int d) {
		List<Integer> edge = list.get(s);
		for(int v : edge) {
			if(p != v) {
				sumB[v] += sumB[s] + 1;
				dfsB(v, s, d + 1);
			}
		}
	}

}
