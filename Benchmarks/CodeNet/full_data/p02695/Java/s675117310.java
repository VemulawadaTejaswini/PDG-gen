import java.util.*;

public class Main {

	static int N;
	static int M;
	static ArrayList<int[]> list;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int Q = sc.nextInt();
		List<int[]> q = new ArrayList<>();
		list = new ArrayList<>();
		for (int i = 0; i < Q; i++) {
			int[] subQ = new int[4];
			subQ[0] = sc.nextInt();
			subQ[1] = sc.nextInt();
			subQ[2] = sc.nextInt();
			subQ[3] = sc.nextInt();
			q.add(subQ);			
		}
		int max = 0;
		int[] arr = new int[N];
		makeArray(1, 0, arr);
		for (int[] a : list) {
			int sum = 0;
			for (int[] b : q) {
				if (a[b[1]-1]-a[b[0]-1] == b[2]) {
					sum += b[3];
				}
			}
			System.out.println(sum);
			max = Math.max(max, sum);
		}
		
		for (int[] a : q) {
			for (int i : a){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println(max);
	}

	static void makeArray(int index, int size, int[] arr) {

		if (size == N) {
			list.add(arr);
			return;
		}
		if (size > N) 
			return;
		/*
		if (N - size < M - index)
			return;
		*/
		if (index > M)
			return;

		int[] newArr = new int[N];
		for (int i = 0; i < size; i++) {
			newArr[i] = arr[i];
		}
		newArr[size] = index;
		makeArray(index+1, size+1, newArr);
		makeArray(index+1, size, arr);
	}
}